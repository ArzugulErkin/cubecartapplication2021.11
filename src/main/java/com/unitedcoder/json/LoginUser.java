package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUser {
    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;

    public LoginUser() {
    }

    public LoginUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Loginuser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
