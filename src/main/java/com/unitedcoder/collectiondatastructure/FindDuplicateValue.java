package com.unitedcoder.collectiondatastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateValue {
    public static void main(String[] args) {
        List<String> country=new ArrayList<>();
        country.add("Canada");
        country.add("Australia");
        country.add("Japan");
        country.add("Canada");
        country.add("Korea");
        country.add("Japan");

        Set<String> set=new HashSet<>();
        for(int i=0;i<country.size();i++){
            String countryName=country.get(i);
            if(set.add(countryName)==false){
                System.out.println(countryName+" is duplicated");
            }
        }
    }
}
