package com.unitedcoder.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiFunctionsDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,0,3,1,90,30,10);
        Optional<Integer> minValue=numbers.stream().min(Integer::compareTo);
        System.out.println(minValue.get());

        List<Integer> sortedList=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> reversedList=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedList);

        List<String> fruites=Arrays.asList("one Apple","Two bananas","Two oranges","one watermelon");
        boolean result=fruites.stream().anyMatch(v->{
            return v.startsWith("one");
        });
        System.out.println(result);

        List<String> countryName=new ArrayList<>();
        countryName.add("Australia");
        countryName.add("Brazil");
        countryName.add("Canada");
        countryName.add("Brazil");
        countryName.add("UK");
        countryName.add("Canada");
        countryName.add("US");

        List<String> distinctValue=countryName.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctValue);
    }
}
