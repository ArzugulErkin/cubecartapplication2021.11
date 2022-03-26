package com.unitedcoder.configutility;

public class ConfigDemo {
    public static void main(String[] args) {
        String configFileName="config-qa.properties";
        ApplicationConfig.readFromConfigProperties(configFileName,"qaurl");
        ApplicationConfig.readFromConfigProperties(configFileName,"username");
        ApplicationConfig.readFromConfigProperties(configFileName,"password");
        ApplicationConfig.readFromConfigProperties(configFileName,"timeout");
    }
}
