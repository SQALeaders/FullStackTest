package PagesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {
    WebDriver driver;

    public SearchResult(WebDriver ldriver) {
        this.driver = ldriver;

    }
public void verifyWiki()
{
    WebElement Wikipedia=driver.findElement(By.partialLinkText("- Wikipedia"));
    Wikipedia.click();

    }
}
