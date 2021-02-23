package com.company.Prototype;

import java.util.HashMap;
import java.lang.*;
import java.util.Map;

public class OPeratingSystemCache  implements Cloneable {
    public static HashMap<String,OperatingSystem> OSMap= new HashMap<>();


    public static OperatingSystem getShape(String shapeId) throws  CloneNotSupportedException{
        OperatingSystem operatingSystem = OSMap.get(shapeId);
        return operatingSystem;
    }

    public static void setOSMap(){
        OSMap.put("Andriod",new Android());
        OSMap.put("Windows",new Windows());
        OSMap.put("IOS",new IOS());
    }


}
