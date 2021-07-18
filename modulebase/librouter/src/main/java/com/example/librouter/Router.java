package com.example.librouter;


import java.util.HashMap;
import java.util.Map;

public class Router {
    final Map<String,Map<String,Class<?>>> groupMap = new HashMap<>();
    final Map<String,Class<?>> routerMap = new HashMap<>();
    private Router(){

    }
    public final static class Holder{
        static Router INSTANCE = new Router();
    }
    public static Router getInstance(){
        return Holder.INSTANCE;
    }
    public  void register(String path,Class<?> clz){
        String[] strArray = path.split("/");
        if(strArray.length>2){
            String groupName = strArray[1];
            String routeName = path;
            if(groupMap.containsKey(groupName)){
                Map<String,Class<?>> group = groupMap.get(groupName);
                if(group!=null){
                    group.put(routeName,clz);
                }
            }
        }
    }
}
