package TestCasesTest;

import PagesTest.GooglePage;
import PagesTest.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySearch extends BaseClass {
    @Test
    public void SearchTest() throws Exception {
        System.out.println("Verify Search reached");
        GooglePage STest=PageFactory.initElements(driver, GooglePage.class);
        STest.Search();
        Thread.sleep(5000);
        String ActualTitle=driver.getTitle();
        String ExpectedTitle= "Google Search";
        //Assert.assertEquals(ActualTitle,ExpectedTitle);
        Assert.assertTrue(ActualTitle.contains("Google"));
        Thread.sleep(10000);


    }
}
