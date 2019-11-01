package com.znbl.common.controller;

import com.znbl.common.entity.*;
import com.znbl.common.serviceImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

//import static java.awt.SystemColor.info;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicServiceImpl topicServiceImpl;
    @Autowired
    CategoryServiceImpl categoryServiceImpl;
    @Autowired
    UserServiceImpl userServiceImpl;
//    @Autowired
//    PlayerServiceImpl playerServiceImpl;
    @Autowired
    PosPlayerServiceImpl  posPlayerServiceImpl;
    @Autowired
    NegPlayerServiceImpl  negPlayerServiceImpl;
//    @Autowired
//    AudServiceImpl audServiceImpl;
    @Autowired
    AudPlayerServiceImpl audPlayerServiceImpl;

    //添加辩题
    @ResponseBody
    @RequestMapping("/addTopic")
    public Msg addTopic(@ModelAttribute Topic topic, @RequestParam Integer c_id) {
        Category category = categoryServiceImpl.getCategoryById(c_id);
        topic.setC_id(c_id);
        topicServiceImpl.addTopic(topic);
        //return "redirect:/topic/getAllTopics";
        return Msg.success();
    }

    //输入新建的辩题
    //应该可以在前台用js
    @RequestMapping("/inputTopic")
    public String inputTopic(Model model){
       List<Category> categories = categoryServiceImpl.getAllCategories();
       model.addAttribute("categories",categories);
       model.addAttribute("topic",new Topic());
       return "addTopic";
    }

    //根据分类查出所有的辩题
    @ResponseBody
    @RequestMapping("/getAllTopics")
    public Msg getAllTopics(Model model) {
        List<Topic> topics = topicServiceImpl.showByCategory();
//        model.addAttribute("topics", topics);
//        return "allTopicsByCategory";
        return Msg.success().add("topics",topics);
    }

    //查看一个辩题的详细情况
    @ResponseBody
    @RequestMapping("/showTopic/{id}")
    public Msg showTopic(@PathVariable Integer id, Model model) {
        Topic topic = topicServiceImpl.getTopicById(id);
//        model.addAttribute("topic", topic);
//        return "topic";
        return Msg.success().add("topic",topic);
    }

    //用户决定成为正方，反方或者观众
    public String takePart(@RequestParam Integer r_id, HttpSession session) {

        //得到用户
        User user = (User) session.getAttribute("user");
        //User user = userServiceImpl.login(Integer id);

        if (r_id == 1) {//正方
            //int nums = playerServiceImpl.numsOfPlayer(r_id);
            int nums = posPlayerServiceImpl.numsOfPosPlayer();
            if (nums == 4) {
                return "/topic/showTopic"; //回到当前页面，无法进入
            } else {
                user.setR_id(r_id);
                //playerServiceImpl.addPlayer(r_id);//添加选手
               posPlayerServiceImpl.addPosPlayer();
                return "/topic/debateroom";//进入辩论
            }
        } else if (r_id == 2) {//反方
            //int nums = playerServiceImpl.numsOfPlayer(r_id);
            int nums = negPlayerServiceImpl.numsOfNegPlayer();
            if (nums == 4) {
                return "/topic/showTopic"; //回到当前页面，无法进入
            } else {
                user.setR_id(r_id);
               // playerServiceImpl.addPlayer(r_id);//添加选手
                negPlayerServiceImpl.addNegPlayer();
                return "/topic/debateroom";//进入辩论
            }
        } else {//观众
            user.setR_id(r_id);
            //audServiceImpl.addAudPlayer();
           // playerServiceImpl.addPlayer(r_id);//添加观众
            audPlayerServiceImpl.addAudPlayer();
            return "/topic/debateroom";//进入观战
        }
    }

    //得到并展示正方反方的集合，并随机分配1，2，3，4辩(随机分配方法未写出)
    //过多重复代码，应该有更好的方法代替
    @RequestMapping("/debateroom")
   public void allocateList(Model model,HttpSession session){
//       List<Player> listOfPos = playerServiceImpl.listsOfPlayer(1);
//       List<Player> listOfNeg = playerServiceImpl.listsOfPlayer(2);
//       List<Player> listOfAud = playerServiceImpl.listsOfPlayer(3);

        List<PosPlayer> listOfPos = posPlayerServiceImpl.listsOfPosPlayer();
        List<NegPlayer> listOfNeg = negPlayerServiceImpl.listsOfNegPlayer();
        List<AudPlayer> listOfAud = audPlayerServiceImpl.listOfAudPlayer();


        //判断，如果正方反方人数都为四则开始
        if(listOfNeg.size() == 4 && listOfPos.size() == 4){
           // playerServiceImpl.allocateRandomly(listOfPos,listOfNeg);
            posPlayerServiceImpl.allocateRandomly(listOfPos);
            negPlayerServiceImpl.allocateRandomly(listOfNeg);
            model.addAttribute("listOfPos",listOfPos);
            model.addAttribute("listOfNeg",listOfNeg);
            model.addAttribute("listOfAud",listOfAud);
        }



        //正方一辩
        //Player posPlayerOne = playerServiceImpl.getPosPlayer(1);
        PosPlayer posPlayerOne = posPlayerServiceImpl.getPosPlayer(1);
        //正方二辩
        //Player posPlayerTwo = playerServiceImpl.getPosPlayer(2);
        PosPlayer posPlayerTwo = posPlayerServiceImpl.getPosPlayer(2);
        //正方三辩
        //Player posPlayerThree = playerServiceImpl.getPosPlayer(3);
        PosPlayer posPlayerThree = posPlayerServiceImpl.getPosPlayer(3);
        //正方四辩
        //Player posPlayerFour = playerServiceImpl.getPosPlayer(4);
        PosPlayer posPlayerFour = posPlayerServiceImpl.getPosPlayer(4);
        //反方一辩
        //Player negPlayerOne = playerServiceImpl.getNegPlayer(1);
        NegPlayer negPlayerOne = negPlayerServiceImpl.getNegPlayer(1);
        //反方二辩
        //Player negPlayerTwo = playerServiceImpl.getNegPlayer(2);
        NegPlayer negPlayerTwo = negPlayerServiceImpl.getNegPlayer(2);
        //反方三辩
        //Player negPlayerThree = playerServiceImpl.getNegPlayer(3);
        NegPlayer negPlayerThree = negPlayerServiceImpl.getNegPlayer(3);
        //反方四辩
        //Player negPlayerFour = playerServiceImpl.getNegPlayer(4);
        NegPlayer negPlayerFour = negPlayerServiceImpl.getNegPlayer(4);

        session.setAttribute("posPlayerOne",posPlayerOne);
        session.setAttribute("posPlayerTwo",posPlayerTwo);
        session.setAttribute("posPlayerThree",posPlayerThree);
        session.setAttribute("posPlayerFour",posPlayerFour);
        session.setAttribute("negPlayerOne",negPlayerOne);
        session.setAttribute("negPlayerTwo",negPlayerTwo);
        session.setAttribute("negPlayerThree",negPlayerThree);
        session.setAttribute("negPlayerFour",negPlayerFour);


   }

   //比赛阶段一,还未进行时间的判断
//   public void debatePhraseOne(@ModelAttribute String posDebate,@ModelAttribute String negDebate,
//                               Model model,HttpSession session){
//
//        //正方一辩
//      // Player posPlayerOne = playerServiceImpl.getPosPlayer(1);
//       PosPlayer posPlayerOne = (PosPlayer) session.getAttribute("posPlayerOne");
//       //使用ajax提醒正方一辩发言
//        //正方发言
//        Integer pos_id = posPlayerOne.getPos_id();
//        posPlayerServiceImpl.insertPosDebate(pos_id,posDebate);
//        //使用ajax弹出输入框进行输入和展示
//       // posPlayerOne.setDebate(posDebate); (该代码是否需要？)
//        model.addAttribute("posDebate",posDebate);
//        //使用ajax进行展示
//       //反方一辩
//       NegPlayer negPlayerOne = (NegPlayer) session.getAttribute("negPlayerOne");
//       //使用ajax提醒反方一辩发言
//       //反方发言
//       //negPlayerOne.setDebate(negDebate);(该代码是否需要？)
//       Integer neg_id = negPlayerOne.getNeg_id();
//       negPlayerServiceImpl.insertNegDebate(neg_id,negDebate);
//       //使用ajax弹出输入框进行输入和展示
//       model.addAttribute("negDebate",negDebate);
//       //使用ajax进行展示
//   }

   //比赛第二阶段,还未进行时间的判断
//    public void debatePhraseTwo(@RequestParam Integer neg_id,@ModelAttribute List<String> posQuestions,@ModelAttribute List<String> negQuestions,
//                                @ModelAttribute String posTwoQuestion,Model model,HttpSession session){
//
//        //正方二辩
//        //Player posPlayerTwo = playerServiceImpl.getPosPlayer(2);
//        PosPlayer posPlayerTwo = (PosPlayer) session.getAttribute("posPlayerTwo");
//        //正方二辩指定对手,可为2或3
//        //实现方法为弹出窗口进行选择
//        NegPlayer negOppositive = negPlayerServiceImpl.getNegPlayer(neg_id);
//        //正方二辩针对反方二辩或三辩提问
//        //posPlayerTwo.setQuestion(posTwoQuestion);
//
//        posQuestions.add(posTwoQuestion);
//        model.addAttribute("posQuestions",posQuestions);
//       //使用ajax进行展示
//
//    }

    //比赛第三阶段,攻辩小结
//    public void debatPharseThere(@ModelAttribute String posConclusion,@ModelAttribute String negConclusion,
//                                 Model model,HttpSession session){
//        //正方一辩
//        // Player posPlayerOne = playerServiceImpl.getPosPlayer(1);
//        PosPlayer posPlayerOne = (PosPlayer) session.getAttribute("posPlayerOne");
//        //反方一辩
//        NegPlayer negPlayerOne = (NegPlayer) session.getAttribute("negPlayerOne");
//
//        //正方一辩进行攻辩小结
//        //posPlayerOne.setConclustion(posConclusion);
//        Integer pos_id = posPlayerOne.getPos_id();
//        posPlayerServiceImpl.insertPosConclusion(pos_id,posConclusion);
//        model.addAttribute("posConclusion",posConclusion);
//        //反方一辩进行攻辩小结
//        //negPlayerOne.setConclustion(negConclusion);
//        Integer neg_id = negPlayerOne.getNeg_id();
////        negPlayerServiceImpl.insertNegConclusion(neg_id,negConclusion);
////        model.addAttribute("negConclusion",negConclusion);
//    }



}

