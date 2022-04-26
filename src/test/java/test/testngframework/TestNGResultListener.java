package test.testngframework;

import com.unitedcoder.configutility.ScreenShotUtility;
import com.unitedcoder.cubecartautomation.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGResultListener implements ITestListener  {
    ScreenShotUtility screenShotUtility=new ScreenShotUtility();
    public void onTestSuccess(ITestResult result) {
        screenShotUtility.takeScreenshot("image",result.getMethod().getMethodName(),
                (WebDriver)result.getTestContext().getAttribute("driver"));

    }


  public void onTestFailure(ITestResult result) {
      screenShotUtility.takeScreenshot("image",result.getMethod().getMethodName(),
              (WebDriver)result.getTestContext().getAttribute("driver"));
        }




    public void onTestSkipped(ITestResult result) {
    }
}

   /* ScreenShotUtility screenShotUtility=new ScreenShotUtility();
    public void onTestSuccess(ITestResult result) {
        screenShotUtility.takeScreenshot("image",result.getMethod().getMethodName(),
                (WebDriver)result.getTestContext().getAttribute("driver"));
    }

    public void onTestFailure(ITestResult result) {

        screenShotUtility.takeScreenshot("image",result.getMethod().getMethodName(),
                (WebDriver)result.getTestContext().getAttribute("driver"));
    }

    public void onTestSkipped(ITestResult result) {

    }
*/


