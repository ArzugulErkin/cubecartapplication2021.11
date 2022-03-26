package com.unitedcoder.collectiondatastructure;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>();
        List<Integer> list2=new LinkedList<>();
        Queue<Integer> list3=new LinkedList<>();

        list1.add(20);
        list1.add(50);
        list1.add(40);
        list1.add(100);
        list1.addLast(9);
        list1.addFirst(300);
        list1.addLast(200);
       list2.addAll(Arrays.asList(20,30,50,100,200));
        //list1.set(2,400);
        System.out.println(list1);
        System.out.println(list2);

        LinkedList<Object> linkedList=new LinkedList<>();
        linkedList.add("ABC");
        linkedList.addLast(90);
        linkedList.addLast(7.89);
        linkedList.addLast(true);

        //for loop
        for(int i=0;i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

        //for each loop
        for(Object value:linkedList){
            System.out.print(value+" ");
        }
        System.out.println();
        //Iterator
        Iterator<Object> it=linkedList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
//        System.out.println(it.next());
//        System.out.println(it.next());
        System.out.println();
        for(int i=0;i<linkedList.size();i++){
            if(it.hasNext()){
                System.out.print(it.next()+" ");
            }
        }

    }
}
