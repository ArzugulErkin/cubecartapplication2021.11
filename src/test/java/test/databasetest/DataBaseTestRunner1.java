package test.databasetest;

import com.unitedcoder.configutility.ApplicationConfig;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;

public class DataBaseTestRunner1 {

    Connection connection=null;
    final static String configFile="config-qa.properties";

    @BeforeClass
    public void setup(){
        String dbUrl=ApplicationConfig.readFromConfigProperties(configFile,"standalone.dbUrl");
        String dbPort=ApplicationConfig.readFromConfigProperties(configFile,"standalone.dbPort");
        String defaultDatabase=ApplicationConfig.readFromConfigProperties(configFile,"standalone.defaultDatabase");
        String userName=ApplicationConfig.readFromConfigProperties(configFile,"standalone.userName");
        String password=ApplicationConfig.readFromConfigProperties(configFile,"standalone.password");
        connection=ConnectionManager.connectToDatabaseServer(dbUrl,dbPort,defaultDatabase,userName,password,ConnectionType.MYSQL);

    }
    @Test(description = "Admin user should be able to insert record into cubecart category table")
    public void insertCategoryTest(){
        String currentTimeStamp=String.valueOf(System.currentTimeMillis());
        CategoryObject categoryObject=new CategoryObject("Arzugul_Category"+currentTimeStamp,"AynDescription",
                0,0,0,0,"Category_Title_arzu","Cat_Description_arzu",
                "arzu",1,1);
        DataAccess dataAccess=new DataAccess();
        Assert.assertTrue(dataAccess.insertNewCategory(categoryObject,connection));

    }

    @AfterClass
    public void tearDown(){
        ConnectionManager.closeDatabaseConnection(connection);
    }
}
