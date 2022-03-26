package com.unitedcoder.collectiondatastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> population=new HashMap<>();
        population.put("German",82000000);
        population.put("Japan",120000000);
        population.put("Netherland",18000000);
        //System.out.println(population.entrySet());
        for(Map.Entry entry:population.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
