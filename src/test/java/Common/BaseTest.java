package Common;

import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    //********** INSTANCIAS **********
    public WebDriver driver=null;
    Login logIn =new Login();


    @Before
    public void Login () throws Exception
    {
        //Create Driver
        driver = Config.navegadorFirefox();
        driver.manage().window().maximize();
        driver.get(Config.URL_QA);

        //Login
        logIn.happyPathLogin(driver);

    }
    @After
    public void tearDown()
    {
        //Cierra la instancia del navegador
        driver.quit();

    }
}
