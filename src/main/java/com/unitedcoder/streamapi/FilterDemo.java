package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,40,30,5,90,60);
//        for(int i:list){
//            if(i%2==0)
//                System.out.println(i);
//        }

        //list.stream().filter(s->s%2==0).forEach(System.out::println);
        list.stream().filter(s->s%2==0).forEach(s->System.out.println(s));

        List<String> names=Arrays.asList("Istanbul","Tokyo","Urumqi","Gulja","Kashghar");
        names.stream().filter(s->s.length()>4 && s.length()<7).forEach(s-> System.out.println(s));
        List<String> filterdNames=new ArrayList<>();
        filterdNames=names.stream().filter(s->s.length()>4 && s.length()<7).collect(Collectors.toList());
        System.out.println(filterdNames);
  }
}
