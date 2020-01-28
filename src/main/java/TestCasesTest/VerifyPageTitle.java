package TestCasesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyPageTitle extends BaseClass {
    @Test
    public void VerifyPT() throws Exception {
        String ActualTitle=driver.getTitle();
        String ExpectedTitle="Google";
        Assert.assertEquals(ActualTitle,ExpectedTitle);
            //SoftAssert Assetion = new SoftAssert();
            //Assetion.assertTrue(ActualTitle.contains("Go"));
        //Assert.assertTrue(ActualTitle.contains("Go"));
        Thread.sleep(10000);
           }
}
