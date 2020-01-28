package TestCasesTest;

import PagesTest.GooglePage;
import PagesTest.SearchResult;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifySerchresults extends BaseClass{
    @Test
    public void VResults() throws Exception {
        GooglePage STest=PageFactory.initElements(driver, GooglePage.class);
        STest.Search();
        Thread.sleep(10000);
        SearchResult VR = PageFactory.initElements(driver, SearchResult.class);
        VR.verifyWiki();
        Thread.sleep(10000);

    }
}
