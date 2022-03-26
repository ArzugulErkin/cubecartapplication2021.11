package com.unitedcoder.collectiondatastructure;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //define a map for websites
        //key--google   value: google website
        Hashtable<String,String> websites=new Hashtable<>();
        websites.put("Google","https://www.google.com");//entry
        websites.put("Yahoo","https://www.yahoo.com");
        websites.put("YouTube","https://www.youtube.com");
        websites.put("CNN","https://www.cnn.com");

        //read value from key
        System.out.println(websites.get("Yahoo"));
        //read all values one by one
       Set<String> keySet= websites.keySet();
       for(String s:keySet){
           System.out.println(websites.get(s));
       }
        System.out.println(websites.entrySet());


    }

}
