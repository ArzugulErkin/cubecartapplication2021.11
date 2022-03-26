package com.unitedcoder.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonWriteDemo2 {
    public static void main(String[] args) {
        User user1=new User("admin User","MaharaDemo","Admin","21",true);
        User user2=new User("Student","MaharaDemo","student","21",true);
        User user3=new User("learner","MaharaDemo","learner","21",true);

        List<User> users=new ArrayList<>();
        users.addAll(Arrays.asList(user1,user2,user3));
        Users maharUsers=new Users(users);
        String objectValue=null;
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectValue=objectMapper.writeValueAsString(maharUsers);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(objectValue);
        try {
            FileUtils.writeStringToFile(new File("Test_Data\\maharUsers.json"),objectValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
