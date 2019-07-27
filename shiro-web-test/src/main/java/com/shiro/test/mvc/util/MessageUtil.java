package com.shiro.test.mvc.util;

import java.util.HashMap;
import java.util.Map;

public class MessageUtil {

    public static Map<String,Object> getSuccessMessageMap(String message){
        Map<String,Object> result=new HashMap<>();
        result.put("status",true);
        result.put("message",message);
        return  result;
    }

    public static Map<String,Object> getErrorMessageMap(String message){
        Map<String,Object> result=new HashMap<>();
        result.put("status",false);
        result.put("message",message);
        return  result;
    }
}
