package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config
{

    // Enviromets
    public static String URL_QA = "http://automationpractice.com/index.php";
    private static String URL_Dev = "http://automationpractice.com/index.php";
    public static String user ="test.0@test.com";
    public static String password="test1234";

    public static WebDriver navegadorChrome ()
    {
        System.getProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        return new ChromeDriver();
    }

}
