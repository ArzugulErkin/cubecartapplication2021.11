package test.databasetest;

import com.unitedcoder.configutility.ApplicationConfig;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.sql.Connection;

public class DataBaseTestRunner {

    Connection connection=null;
    final static String configFile="config-qa.properties";
@BeforeClass
    public void setup(){
        String dbUrl=ApplicationConfig.readFromConfigProperties(configFile,"qa.dbUrl");
        String dbPort=ApplicationConfig.readFromConfigProperties(configFile,"qa.dbPort");
        String defaultDatabase=ApplicationConfig.readFromConfigProperties(configFile,"qa.defaultDatabase");
        String userName=ApplicationConfig.readFromConfigProperties(configFile,"qa.userName");
        String password=ApplicationConfig.readFromConfigProperties(configFile,"qa.password");
        connection=ConnectionManager.connectToDatabaseServer(dbUrl,dbPort,defaultDatabase,userName,password,ConnectionType.MYSQL);

    }

    @Test(description = "Verify a product in the database")
    public void verifyProductTest(){
        DataAccess dataAccess=new DataAccess();
        boolean isProductExist=dataAccess.getProductName("semetway",connection);
        Assert.assertTrue(isProductExist);
    }

    @Test(description = "Verify a customer in the database")
    public void verifyCustomerTest(){
        DataAccess dataAccess=new DataAccess();
        Assert.assertTrue(dataAccess.getCustomer("dolkuntest@test.com",connection));
    }
    @Test(description = "Admin user should be able to insert record into cubecart category table")
    public void insertCategoryTest(){
        String currentTimeStamp=String.valueOf(System.currentTimeMillis());
        CategoryObject categoryObject=new CategoryObject("AynigarCategory"+currentTimeStamp,"AynDescription",
                0,0,0,0,"Category_Title_Ayn","Cat_Description_Ayn",
                "AYN",1,1);
        DataAccess dataAccess=new DataAccess();
        Assert.assertTrue(dataAccess.insertNewCategory(categoryObject,connection));
    }

    @AfterClass
    public void tearDown(){
        ConnectionManager.closeDatabaseConnection(connection);
    }
}

