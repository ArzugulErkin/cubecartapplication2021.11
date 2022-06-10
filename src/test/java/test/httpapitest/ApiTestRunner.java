package test.httpapitest;

import com.unitedcoder.configutility.ApplicationConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.cubecartrestassuredapi.PayloadUtility;

public class ApiTestRunner {
    private static String baseURL;
    private static int port;
    private static String username;
    private static String password;
    private static String configFile="config-qa.properties";


    @BeforeClass
    public void setup(){
        baseURL= ApplicationConfig.readFromConfigProperties(configFile,"api.baseurl");
        username= ApplicationConfig.readFromConfigProperties(configFile,"api.username");
        password= ApplicationConfig.readFromConfigProperties(configFile,"api.password");
        port= Integer.parseInt(ApplicationConfig.readFromConfigProperties(configFile,"api.port"));

    }
    @Test
    public void getAllCustomersTest(){
        ApiRequestHandler apiRequestHandler=new ApiRequestHandler();
        ApiResponseHandler apiResponseHandler=apiRequestHandler.getAllCustomers(username,password,
                baseURL,port,"customers");
        Assert.assertEquals(apiResponseHandler.getResponseCode(),200);




    }
    @Test
    public void addCategoryTest(){
        ApiRequestHandler apiRequestHandler=new ApiRequestHandler();
        ApiResponseHandler apiResponseHandler=apiRequestHandler.addCategory(username,password,
                baseURL,port,"category", PayloadUtility.getCategoryPayload("ArzugulE01",
                        "ArzugulE001",2,3,1));
        Assert.assertTrue(apiResponseHandler.getResponseCode()==200);
        Assert.assertTrue(apiResponseHandler.getResponseContent().contains("ArzugulE"));
    }
}
