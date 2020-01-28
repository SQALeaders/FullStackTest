package PagesTest;

import UtilTest.Fakerdata;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class GooglePage {

    WebDriver driver;

    public GooglePage(WebDriver ldriver) {
        this.driver = ldriver;

    }

    @FindBy(id="hplogo")
    @CacheLookup
    WebElement Logo;
    @FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    @CacheLookup
    WebElement SearchBox;
    @FindBy(className="HPVvwb")
    @CacheLookup
    WebElement Mike;
    @FindAll({@FindBy(xpath="//ul[@role='listbox']//li/descendant::div[@class='sbl1']")})
    List<WebElement> SOptions;
    @FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
    @CacheLookup
    WebElement GSearch;
    @FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")
    @CacheLookup
    WebElement FLucky;
    @FindBy(linkText="Français")
    @CacheLookup
    WebElement French;
    @FindBy(linkText="Gmail")
    @CacheLookup
    WebElement Mail;
    @FindBy(linkText="Images")
    @CacheLookup
    WebElement ISearch;
    @FindBy(linkText="About")
    @CacheLookup
    WebElement AboutLink;



    public void VerifyLogo()
    {
        Boolean logoPresent = Logo.isDisplayed();
        Assert.assertTrue (logoPresent);
    }

    public void Search() throws Exception {
        String FData=Fakerdata.CountryN();
        SearchBox.sendKeys(FData);
        Thread.sleep(2000);
        int i;
        for(i=0; i<SOptions.size(); i++)
        {
            String ListItem = SOptions.get(i).getText();
            if (ListItem.equalsIgnoreCase (FData)) {
                SOptions.get(i).click();
                break;
            }
        }

    }

}
