package test.cubecartrestassuredapi;

import com.unitedcoder.configutility.ApplicationConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CubeCartApiTest {
    private static String baseURL;
    private static String port;
    private static String username;
    private static String password;
    private static String configFile="config-qa.properties";


    @BeforeClass
    public void setup(){
        baseURL= ApplicationConfig.readFromConfigProperties(configFile,"api.baseurl");
        username= ApplicationConfig.readFromConfigProperties(configFile,"api.username");
        password= ApplicationConfig.readFromConfigProperties(configFile,"api.password");
        port= ApplicationConfig.readFromConfigProperties(configFile,"api.port");

    }
    @Test
    public  void getAllCustomersTest(){
        //sending request to get respone
        Response response= RestAssured.given().auth().basic(username,password)
                .when().get(baseURL+":"+port+"/customers");
        System.out.println(response.getBody().prettyPrint());
        //check the static code
        int responseCode=response.getStatusCode();
        Assert.assertEquals(responseCode,200);

    }
    @Test
    public void getAllProductTest(){
        //Sending request to get respone
        Response response= RestAssured.given().auth().basic(username,password)
                .when().get(baseURL+":"+port+"/products");
        System.out.println(response.getBody().prettyPrint());
        //check the status code
        int responseCode=response.getStatusCode();
        Assert.assertEquals(responseCode,200);
    }

    @Test
    public void addCategoryTest(){
        Response response=RestAssured.given().headers("Content-Type","application/json").and()
                .body(PayloadUtility.getCategoryPayload("AADescription","AAAAFruits",2,3,1))
                .auth().basic(username,password)
                .when().post(baseURL+":"+port+"/category").then().extract().response();
        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertTrue(response.jsonPath().getString("catName").contains("AAAAFruits"));

    }


}
