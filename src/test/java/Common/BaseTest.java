package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    //********** INSTANCIAS **********
    public WebDriver driver=null;
    Login logIn =new Login();


    @BeforeTest
    public void Login () throws Exception
    {
        //Create Driver
        driver = Config.navegadorFirefox();
        driver.manage().window().maximize();
        driver.get(Config.URL_QA);

        //Login
        logIn.happyPathLogin(driver);

    }
    @AfterTest
    public void tearDown()
    {
        //Cierra la instancia del navegador
        driver.quit();

    }
}
