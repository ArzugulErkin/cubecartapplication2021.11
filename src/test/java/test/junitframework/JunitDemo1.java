package test.junitframework;

import org.junit.*;

public class JunitDemo1 {

    @BeforeClass
    public static void setup(){
        System.out.println("Before class only runs once");
    }
    @Before
    public void beforeEvryTest(){
        System.out.println("run before evry test");
    }
    @Test
    public void test1(){
        System.out.println("square root test");
    }
    @Test
    public void test2(){
        System.out.println("compare two string");
    }
    @Test
    public void test3(){
        System.out.println("compare two numbers");
    }
    @After
    public void end(){
        System.out.println("");

    }
    @AfterClass
    public static void tearDown(){
        System.out.println("runs only once after class!");
    }



}
