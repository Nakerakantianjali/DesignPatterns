package com.company.StructuralPattern.FlyWeightPattern;

import java.lang.reflect.Type;
import java.util.HashMap;

public class OSFactory {
    public static HashMap<String,OperatingSystem>OsMap=new HashMap<>();
    public static OperatingSystem getOPeratingSystem(String type){
        if(type.equals("Android")){
            if(OsMap.get(type)==null){
                OsMap.put(type,new Android());

            }

                return OsMap.get(type);
        }
        if(OsMap.get(type)==null){
            OsMap.put("IOS",new IOS());
        }
        return OsMap.get(type);

    }


}

