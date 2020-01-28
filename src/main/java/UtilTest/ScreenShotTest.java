package UtilTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotTest {
    public static void CaptureScreenShot(WebDriver driver, String ScreenshotName)
    {
        try {
            TakesScreenshot TS=(TakesScreenshot)driver;
            File source=TS.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File ("./ScreenShot/" +ScreenshotName+".png"));
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Exception while taking screenshot is " +e);
        }
    }
}
