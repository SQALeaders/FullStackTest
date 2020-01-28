package PagesTest;
        import UtilTest.ReadConfigTest;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.edge.EdgeOptions;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.firefox.GeckoDriverInfo;
        import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url) throws InterruptedException {
        if (browserName.equalsIgnoreCase("firefox"))
        {
            ReadConfigTest config=new ReadConfigTest();
            System.setProperty("webdriver.gecko.driver", config.GetGeckoPath());
            driver=new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("Chrome"))
        {
            ReadConfigTest config=new ReadConfigTest();
            System.setProperty("webdriver.chrome.driver", config.GetCromePath());
            driver=new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("IE"))
        {
            System.out.println("BrowserFactoryIE reached");
            ReadConfigTest config=new ReadConfigTest();
            System.setProperty("webdriver.ie.driver", config.GetIEPath());
            driver=new InternetExplorerDriver();

        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            ReadConfigTest config=new ReadConfigTest();
            System.setProperty("webdriver.edge.driver", config.GetEdgePath());
            driver=new EdgeDriver();

        }
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //driver.navigate().to("url");
        driver.get(url);
        return driver;
    }
}
