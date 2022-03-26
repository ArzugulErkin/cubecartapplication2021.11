package com.unitedcoder.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ReadFromURL {
    public static void main(String[] args) {
        List<String> webSites=new ArrayList<>();
        webSites.add("https://www.google.com");
        webSites.add("https://www.unitedcoder.com");

        for(String webs:webSites){
            URL url= null;
            try {
                url = new URL(webs);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader= null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String inputLines=null;

            while(true){
                try {
                    if (!((inputLines=bufferedReader.readLine())!=null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(inputLines);
            }

            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
