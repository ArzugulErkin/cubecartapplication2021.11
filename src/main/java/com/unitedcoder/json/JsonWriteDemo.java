package com.unitedcoder.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JsonWriteDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Admin");
        user.setPassword("MaharaDemo");
        user.setAge("22");
        user.setUserType("admin");
        user.setActive(true);
        String userInfo = null;
        ObjectMapper
                objectMapper = new ObjectMapper();
        try {
            userInfo = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(userInfo);
        try {
            FileUtils.writeStringToFile(new File("Test_Data\\userInfo.json"), userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
