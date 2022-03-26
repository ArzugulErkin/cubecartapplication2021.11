package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.ListIterator;

public class example {
    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=10;
        a[2]=30;

        System.out.println(a[1]);
        String[] s=new String[3];
        s[1]="A";
        s[2]="B";
        System.out.println(s[0]);

        ArrayList<String> names=new ArrayList<>();
        names.add("A");
        names.add(0,"B");
        names.add("C");
        //names.remove(1);
        System.out.println(names);

        ListIterator<String> iterator=names.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //System.out.println(iterator.next());





    }
}
