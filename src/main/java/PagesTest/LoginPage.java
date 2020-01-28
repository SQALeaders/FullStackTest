package PagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver ldriver) {
        this.driver = ldriver;

    }

    @FindBy(id="email")
    @CacheLookup
    WebElement UserName;
    @FindBy(id="pass")
    @CacheLookup
    WebElement PassWord;
    @FindBy(xpath="//*[@value='Log In']")
    @CacheLookup
    WebElement Login;
    @FindBy(linkText="Forgotten account?")
    @CacheLookup
    WebElement FogotPassword;
    @FindBy(xpath="//*[@id=\"u_0_m\"]")
    @CacheLookup
    WebElement Fname;
    @FindBy(xpath="//*[@id=\"u_0_o\"]")
    @CacheLookup
    WebElement LName;
    @FindBy(xpath="//*[@id=\"u_0_r\"]")
    @CacheLookup
    WebElement EAddress;
    @FindBy(xpath="//*[@id=\"u_0_u\"]")
    WebElement CEAdd;
    @FindBy(xpath="//*[@id=\"u_0_w\"]")
    @CacheLookup
    WebElement NewPass;
    @FindBy(xpath="//*[@id=\"u_0_13\"]")
    @CacheLookup
    WebElement SignUp;
    @FindBy(id="day")
    @CacheLookup
    WebElement DayDD;
    @FindBy(id="month")
    @CacheLookup
    WebElement MonthDD;
    @FindBy(id="year")
    @CacheLookup
    WebElement YearDD;
    @FindBy(xpath="//*[@id=\"u_0_z\"]/span[1]/label")
    WebElement Sex;


    public void DropDown()
    {

    }
    public void LoginFB(String UName, String Pass)
    {
        //System.out.print("UName"+UName+" "+"Pass"+Pass);
        UserName.sendKeys(UName);
        PassWord.sendKeys(Pass);

        Login.click();
    }
    public void LinkText()
    {
        FogotPassword.click();

    }
    public void SignUp(String FN, String LN, String Password)
    {
        Fname.sendKeys(FN);
        LName.sendKeys(LN);
        EAddress.sendKeys("abc@yahoo.com");
        CEAdd.sendKeys("abc@yahoo.com");
        NewPass.sendKeys(Password);
        Select Day=new Select(DayDD);
        Day.selectByVisibleText("15");
        Select Month=new Select(MonthDD);
        Month.selectByVisibleText("Oct");
        Select Year=new Select(YearDD);
        Year.selectByVisibleText("1983");
        Sex.click();
        SignUp.click();

    }
}