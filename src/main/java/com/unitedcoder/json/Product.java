package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
   @JsonProperty("product-name")
   private String productName;
   @JsonProperty("product-code")
   private String productCode;
   @JsonProperty("manufacturer")
   private String productManufacturer;
   @JsonProperty("category")
   private String productCategory;

    public Product() {
    }

    public Product(String productName, String productCode, String productManufacturer, String productCategory) {
        this.productName = productName;
        this.productCode = productCode;
        this.productManufacturer = productManufacturer;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public String getProductCategory() {
        return productCategory;
    }
}
