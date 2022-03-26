package com.unitedcoder.collectiondatastructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        TreeMap<String,Integer> prices=new TreeMap<>();
        prices.put("Iphone",1000);
        prices.put("Sumsung",600);
        prices.put("LG",400);
        prices.put("Blackberry",300);

        for(Map.Entry price:prices.entrySet()){
            System.out.println(price.getKey()+" "+price.getValue());
        }
    }
}
