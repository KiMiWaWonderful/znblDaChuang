package com.znbl.config;

import com.znbl.pojo.Debate;
import com.znbl.utils.JsonUtils;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> IDs = new ArrayList<Integer>();
        IDs.add(+2);
        IDs.add(+3);
        Debate debate = new Debate();
        debate.setNegReTime(1);
        debate.setPosReTime(2);
        debate.setNum(3);
        debate.setTime(4);
        debate.setID(5);
        debate.setChoice(6);
        debate.setIDs(IDs);
        debate.setSignal(7);
        String message = JsonUtils.objectToJson(debate);
        System.out.println(message);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("msg",message);

        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        jsonObjects.add(jsonObject1);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",1);
        jsonObject.put("name",2);
        jsonObject.put("msg",3);
        jsonObject.put("roleId",4);
        jsonObject.put("num",5);

        jsonObject.put("msg",jsonObjects);
        String message1 = jsonObject.toString();

        System.out.println(message1);
        System.out.println(JsonUtils.isJSONValid(message));
        System.out.println(JsonUtils.isJSONValid(message1));
    }

}
