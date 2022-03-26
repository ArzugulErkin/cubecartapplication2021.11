package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerifyOrderOfCollection {
    public static void main(String[] args) {
        List<String> phoneList=new ArrayList<>();
        phoneList.add("Nokia");
        phoneList.add("Iphone");
        phoneList.add("LG");
        phoneList.add("Sumsung");
        phoneList.add("Blackberry");
        phoneList.add("HTC");
        phoneList.add("Sony");
        System.out.println(phoneList);
        List<String> copiedList=new ArrayList<>();
        copiedList.addAll(phoneList);
        System.out.println(copiedList);
        Collections.sort(copiedList);
        System.out.println(copiedList);
        boolean isSorted=phoneList.equals(copiedList);
        if(isSorted){
            System.out.println("Phone List are Sorted correctly!!!!");
        }
        else {
            System.out.println("Phone List are not Sorted");
        }
    }
}
