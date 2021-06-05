package Common;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    private WebDriver driver =null;
    //Espera
    private WebDriverWait wait= null;

    @Before
    public void Login () throws Exception
    {
        //Create Driver
        driver = Config.navegadorChrome();
        //Implicit wait
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        //Login
        driver.get(Config.URL_QA);

    }
}
