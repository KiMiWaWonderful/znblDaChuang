package me.gacl.websocket;

import com.znbl.dao.JedisClient;
import com.znbl.pojo.Debate;
import com.znbl.pojo.User;
import com.znbl.utils.DebateUtils;
import com.znbl.utils.HttpClientUtil;
import com.znbl.utils.JsonUtils;
//import org.json.JSONArray;
//import org.json.JSONObject;
import net.sf.json.JSONObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听通过这个用户连接的终端访问URL地址,客户端可以URL来连接到WebSocket服务器端
 */
@ServerEndpoint("/websocket/{id}/{name}/{roleId}/{debateId}")
public class WebSocketTest   {
	//静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static int onlineCount = 0;
	// 记录不同辩题的连接人数
	private static volatile Hashtable<String, Integer> debateOnlines = new Hashtable<String, Integer>();

	// 存储各个辩题的辩手信息，key 为debateId ， value 为辩手的map集合
	private static Map<String,Map<Integer,User>> debaterMap = new HashMap<>();

	// 存储用户信息
	private User user;

	//concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
	private static CopyOnWriteArraySet<WebSocketTest> webSocketSet = new CopyOnWriteArraySet<WebSocketTest>();

	//与某个客户端的连接会话，需要通过它来给客户端发送数据
	private Session session;

//	private static JedisClient jedisClient = new ClassPathXmlApplicationContext("spring/applicationContext-redis.xml").getBean(JedisClient.class);

	private static int isSystem;




	/**
	 * 连接建立成功调用的方法
	 * @param session  可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen
	public void onOpen(Session session, @PathParam("id")String id,
					   @PathParam("name")String name,
					   @PathParam("roleId")Integer roleId,
					   @PathParam("debateId")String debateId){
		System.out.println("用户建立连接 -- > [{id = "+ id + "},{name = "+ name +"}," +
				"{roleId = "+ roleId +"},{debateId = "+ debateId +"}]");
		// 封装数据
		this.session = session;
		user = new User(id,name,roleId,debateId+"");

		// 获取该辩题的所有已有辩手
		Map<Integer, User> debaters = debaterMap.get(debateId);
		List list;
		if(debaters != null){
			list = new ArrayList();

			Integer delKey = 110;
			for(Map.Entry<Integer, User> entry  : debaters.entrySet()){
				/*if(entry.getKey().equals(roleId)){
					String json = JsonUtils.objectToJson(list);
					isSystem = 1;
					onMessage(json,session);
					isSystem = 0;
					return;
				}*/
				if(entry.getValue().getId().equals(id)){
					delKey = entry.getKey();
				}
			}

			if(delKey != 110)
				debaters.remove(delKey);

			debaters.put(roleId,user);
			debaterMap.put(debateId,debaters);

			for(Map.Entry<Integer, User> entry  : debaters.entrySet()){
				list.add(entry.getValue());
			}

			addOnlineCount();           //在线数加1
			webSocketSet.add(this);     //加入set中

			String json = JsonUtils.objectToJson(list);


			isSystem = 1;
			onMessage(json,session);
			isSystem = 0;

		}else{
			debaters = new HashMap<>();
			debaters.put(roleId,user);
			debaterMap.put(debateId,debaters);
		}

		// 获取用户作为辩论者的信息

		System.out.println("webSocketSet - size == " + webSocketSet.size());

		Integer nums = debateOnlines.get(debateId);
		if(nums != null){
			debateOnlines.put(debateId,nums + 1);
		}else {
			debateOnlines.put(debateId,1);
		}
		System.out.println("有新连接加入！当前在线人数为" + debateOnlines.get(debateId)  +  "欢迎" + "【" + name + "】");

		//onMessage("有新连接加入！当前在线人数为" + debateOnlines.get(debateId)  +  "欢迎" + "【" + name + "】 进入辩题id为:" + debateId + "的聊天室",session);

	}

	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose(){
		webSocketSet.remove(this);  //从set中删除
		subOnlineCount();           //在线数减1
		String debateId = user.getDebateId();
		Integer nums = debateOnlines.get(debateId);
		if(nums != null){
			debateOnlines.put(debateId,nums - 1);
		}
		// 获取该辩题的所有已有辩手
		Map<Integer, User> debaters = debaterMap.get(debateId);
		int roleId = this.user.getRoleId();
		if(roleId >= -4 && roleId <= 4){
			debaters.remove(roleId);
			debaterMap.put(this.user.getDebateId(),debaters);
		}
		System.out.println("有一连接关闭！当前在线人数为" + debateOnlines.get(debateId));
		isSystem = 1;
		onMessage("\"有一连接关闭！当前在线人数为" + debateOnlines.get(debateId)  +  "  【" + user.getName() + "】 已离开辩题id为:" + debateId + "的聊天室\"",session);
		isSystem = 0;
	}

	/**
	 * 收到客户端消息后调用的方法
	 * @param message 客户端发送过来的消息
	 * @param session 可选的参数
	 */
	@OnMessage
	public void onMessage(String message, Session session) {
		String debateId = user.getDebateId();
		StringBuilder sb = new StringBuilder();
        JSONObject jsonObject = new JSONObject();
		String msg1 = message;



		if(isSystem == 1){

			jsonObject.put("id","10544");
			jsonObject.put("name","系统消息");
			jsonObject.put("roleId",110);
			jsonObject.put("num",debateOnlines.get(debateId));
			jsonObject.put("msg",message);

		}else {

			jsonObject.put("id",user.getId());
			jsonObject.put("name",user.getName());
			jsonObject.put("roleId",user.getRoleId());
			jsonObject.put("num",debateOnlines.get(debateId));
			jsonObject.put("msg",message);

//
		}


        Debate debate = null;

//
		try {
//
               debate = JsonUtils.jsonToPojo(message,Debate.class);
                if (debate == null) {
                    System.out.println("The debate is null");
                    System.out.println("转化成debate失败");
                } else {
                    //JSONObject jsonObject = new JSONObject(message);
                    System.out.println("解析json成功！");
//
                    int round = debate.getRound();
                    String msg = "";
                    if (round == 1) {
                        msg = DebateUtils.debateRoundOne(message);

                    } else if (round == 2) {
                        msg = DebateUtils.debateRoundTwo(message);

                    } else if (round == 3) {
                        msg = DebateUtils.debateRoundThere(message);

                    } else if (round == 4) {
                        msg = DebateUtils.debateRoundFour(message);

                    } else if (round == 5) {
                        msg = DebateUtils.debateRoundFive(message);

                    }


                    JSONObject jsonObject1 = new JSONObject();
                    jsonObject1.put("msg",msg);

                    List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
                    jsonObjects.add(jsonObject1);

                    jsonObject.put("msg",jsonObjects);

                   message = jsonObject.toString();

                }

		}catch (Exception e){
			e.printStackTrace();
			System.out.println("发生错误！");
			//continue;
		}
		if(isSystem == 1){
			System.out.println(" --------------------- ");
			System.out.println("来自系统的消息:" + msg1);
			System.out.println(" --------------------- ");

			sb.append("{");
			sb.append("\"id\":\"").append("10544");
			sb.append("\",\"name\":\"").append("系统消息");
			if(debate == null){
				sb.append("\",\"msg\":").append(msg1);
				sb.append(",\"message\":").append("\"\"");
			}else{
				sb.append("\",\"msg\":").append("\"\"");
				sb.append(",\"message\":").append(message);
			}

			sb.append(",\"roleId\":\"").append(110);
			sb.append("\",\"num\":\"").append(debateOnlines.get(debateId));
			sb.append("\"}");


		}else {
			System.out.println(" --------------------- ");
			System.out.println("来自客户端的消息:" + msg1);
			System.out.println(" --------------------- ");

			sb.append("{");
			sb.append("\"id\":\"").append(user.getId());
			sb.append("\",\"name\":\"").append(user.getName());
			if(debate == null){
				sb.append("\",\"msg\":").append(msg1);
				sb.append(",\"message\":").append("\"\"");
			}else{
				sb.append("\",\"msg\":").append("\"\"");
				sb.append(",\"message\":").append(message);
			}

			sb.append(",\"roleId\":\"").append(110);
			sb.append("\",\"num\":\"").append(debateOnlines.get(debateId));
			sb.append("\"}");

		}

		message = sb.toString();

		System.out.println("开始群发信息");
			System.out.println("==============");
		for(WebSocketTest item: webSocketSet){
			if(item.user.getDebateId().equals(debateId)){
				try {
					item.sendMessage(message);
					// item.sendMessage(jsonObject);
					System.out.println("   -> 发送成功！");
				} catch (IOException e) {
					e.printStackTrace();
					continue;
				}
			}else {
				System.out.println("   -> 发送失败！");
			}
		}
		System.out.println("群发结束");
		System.out.println("转发的消息 == " + message);


	}

	/**
	 * 发生错误时调用
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session, Throwable error){
		System.out.println("发生错误  error = " + error);
		if(error != null)
			error.printStackTrace();
	}

	/**
	 * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
	 * @param message
	 * @throws IOException
	 */
	public void sendMessage(String message) throws IOException{
		this.session.getBasicRemote().sendText(message);
		//this.session.getAsyncRemote().sendText(message);
	}

	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		WebSocketTest.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		WebSocketTest.onlineCount--;
	}
}
