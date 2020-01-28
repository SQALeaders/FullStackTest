package UtilTest;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigTest {
    Properties Pro;

    public ReadConfigTest()  {
        try {
            File Src=new File("C:\\Users\\sivasothywaran\\IdeaProjects\\FullStackTest\\Config.property");
            FileInputStream fis=new FileInputStream(Src);
            Pro = new Properties();
            Pro.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String GetCromePath()
    {
        //String ChromePath = Pro.getProperty("ChromeDriver");
        //return ChromePath;
        return Pro.getProperty("ChromeDriver");
    }
    public String GetGeckoPath()
    {
        //String ChromePath = Pro.getProperty("FirefoxDriver");
        //return ChromePath;
        return Pro.getProperty("FirefoxDriver");
    }
    public String GetEdgePath()
    {
        //String EdgePath = Pro.getProperty("EdgeDriver");
        //return EdgePath;
        return Pro.getProperty("EdgeDriver");
    }
    public String GetIEPath()
    {
        System.out.println("Configread reached");
        //String EdgePath = Pro.getProperty("IE");
        //return EdgePath;
        return Pro.getProperty("IEDriver");
    }
    public String GetURL()
    {
        //String url = Pro.getProperty("URL");
        //return url;
        return Pro.getProperty("URL");
    }
    public String GetBrowser()
    {
        //String url = Pro.getProperty("Browser");
        //return url;
        return Pro.getProperty("Browser");
    }
}
