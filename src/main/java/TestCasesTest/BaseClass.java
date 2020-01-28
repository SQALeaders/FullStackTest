package TestCasesTest;

import PagesTest.BrowserFactory;
import UtilTest.ReadConfigTest;
import UtilTest.ScreenShotTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class BaseClass {
    public WebDriver driver;
@BeforeMethod
@Parameters("OBrowser")

    public void setup(String BrowserName) throws InterruptedException {
    System.out.println("Baseclass reached");
    ReadConfigTest config = new ReadConfigTest();
    //driver = BrowserFactory.startBrowser(config.GetBrowser(), config.GetURL());
    driver = BrowserFactory.startBrowser(BrowserName, config.GetURL());
    Thread.sleep(5000);
    }

@AfterMethod
    public void TearDown() throws InterruptedException {
    if (driver == null)
        return;
    driver.quit();
}

@AfterMethod
    public void ScreenShot(ITestResult result)
{
    if (ITestResult.FAILURE==result.getStatus())
       {
           ScreenShotTest.CaptureScreenShot(driver, result.getName());
       }
}
}

