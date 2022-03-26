package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CubeCartTestData {
    @JsonProperty("loginuser")
    private LoginUser loginUser;
    @JsonProperty("product")
    private Product product;

    public CubeCartTestData() {
    }

    public CubeCartTestData(LoginUser loginUser, Product product) {
        this.loginUser = loginUser;
        this.product = product;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public Product getProduct() {
        return product;
    }
}
