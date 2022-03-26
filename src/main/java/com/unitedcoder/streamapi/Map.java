package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> cars= Arrays.asList("Honda","BMW","Toyota");
        List<String> upperCaseCars=new ArrayList<>();
        upperCaseCars=cars.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseCars);
        cars.stream().map(m->m.length()).forEach(m-> System.out.println(m));
    }
}
