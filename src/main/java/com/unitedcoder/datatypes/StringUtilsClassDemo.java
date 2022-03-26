package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsClassDemo {
    public static void main(String[] args) {
        String language="java";
        String school="selenium master";
        String s1="100A";
        String s2=" ";

        System.out.println(StringUtils.reverse(language));

//        for(int i=language.length()-1;i>=0;i--){
//            System.out.print(language.charAt(i)+" ");
//        }

        System.out.println(StringUtils.isNumeric(s1));
        System.out.println(StringUtils.isEmpty(s2));
        System.out.println(StringUtils.capitalize(language));
        System.out.println(StringUtils.capitalize(school));
    }
}
