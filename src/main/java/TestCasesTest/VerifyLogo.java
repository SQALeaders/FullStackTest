package TestCasesTest;

import PagesTest.GooglePage;
import PagesTest.LoginPage;
import UtilTest.Fakerdata;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogo extends BaseClass{

    @Test
    public void VLogo() throws InterruptedException {
        GooglePage LogoP = PageFactory.initElements(driver, GooglePage.class);
        LogoP.VerifyLogo();
        Thread.sleep(20000);

    }

}
