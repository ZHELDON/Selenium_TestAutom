package MiprimerTest;

import Common.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class MiPrimerTest
{
    private WebDriver driver;

    //Inicia la Configuración del navegador
    @Before
    public void setUp()
    {
        // Se coloca la dirección del driver, sea chrome, mozilla o edge
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        //Crea la instancia del driver
        driver = new ChromeDriver();

        // Maximiza el navegador
        driver.manage().window().maximize();

        //Envia la direccion del sistema de  pruebas al nevegador
        //driver.get("https://www.amazon.com/");
        driver.get("http://automationpractice.com/index.php");

    } //Termina la configuracion del navegador

  /*  @Test
    public void TestAmazon() throws InterruptedException
    {
        //Thread.sleep(5000);
        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Alexa");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(4000);
        WebElement comboSelectfe = driver.findElement(By.id("a-autoid-0-announce"));
        comboSelectfe.click();
        WebElement Selectfeindex = driver.findElement(By.id("s-result-sort-select_2"));
        Selectfeindex.click();
        //inputBusqueda.submit(); a-link-normal a-text-normal
        Thread.sleep(4000);
    } */

  /*  @Test
    public void UsoXPath() throws InterruptedException
    {
        //Xpath absoluto
        /* WebElement ButtonMarket = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[2]/span[2]"));
        ButtonMarket.click();
        Thread.sleep(4000);*/

        //Xpath Relativo
        /*WebElement ButtonMarket = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        ButtonMarket.click();
        Thread.sleep(4000);*/

        // XPath Relativo con contenido de Texto
        /*Thread.sleep(7000);
        WebElement CuentasYListas = driver.findElement(By.xpath("//*[contains(text(),'Account &')]"));
        CuentasYListas.click();
        Thread.sleep(4000);*/

        //Uso Xpath multiples atributos
        /*WebElement inputMultiATR = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox' and @dir='auto']"));
        inputMultiATR.click();
        inputMultiATR.clear();
        inputMultiATR.sendKeys("Celulares");
        inputMultiATR.submit();
        Thread.sleep(4000);*/

        //Uso de Xpath Padre e Hijo
        /*WebElement inputRelationship = driver.findElement(By.xpath("//div/input[@id ='twotabsearchtextbox' and @dir='auto']"));
        inputRelationship.click();
        inputRelationship.clear();
        inputRelationship.sendKeys("Celulares");
        inputRelationship.submit();
        Thread.sleep(4000);


    }*/

    @Test
    public void HappyPathLogin() throws InterruptedException
    {
        WebElement intoLogin = driver.findElement(By.xpath("//div/a[@class='login']"));
        intoLogin.click();
        Thread.sleep(2000);



        WebElement emailInput = driver.findElement(By.id("email"));
        //scroll
        Point classname = emailInput.getLocation();
        int ycordi = classname.getY() - 200;
        System.out.println("CordY:"+ycordi);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+ycordi+")");
        Thread.sleep(2000);
        //fin scroll

        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(Config.user);
        //Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(Config.password);
        //SubmitLogin
        //Thread.sleep(1000);
        WebElement ButtonSingIn = driver.findElement(By.id("SubmitLogin"));
        ButtonSingIn.click();
        //Thread.sleep(2000);
    }

    /*@Test
    public void EmailFailedtoLogin() throws InterruptedException
    {
        WebElement intoLogin = driver.findElement(By.xpath("//div/a[@class='login']"));
        intoLogin.click();
        Thread.sleep(2000);
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("testbad@test.com");
        //Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(Config.password);
        //SubmitLogin
        //Thread.sleep(1000);
        WebElement ButtonSingIn = driver.findElement(By.id("SubmitLogin"));
        ButtonSingIn.click();
        Thread.sleep(7000);
        //- //li[contains(text(),"Authentication failed.")]
        WebElement compareTextResult = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"));
        //Campo Email vacio: WebElement compareTextResult = driver.findElement(By.xpath("//li[contains(text(),'An email address required.')]"));
        //Email sin sintaxis "Ej: test.com" //li[contains(text(),'Invalid email address.')]
        //Campo Password vacio: Password is required. //li[contains(text(),'Password is required.')]
        //Password Erroneo: Invalid password. //li[contains(text(),'Invalid password.')]
        // - //a[contains(text(),'Forgot your password?')]  + Click
        if(compareTextResult.getText().equalsIgnoreCase  ("Authentication failed."))
        {
            System.out.println("Fallo por: Authentication failed.");
        }
        else
        {
            System.out.println("no encontrado");
        }


    }*/

    @After
    public void tearDown()
    {
        //Cierra la instancia del navegador
        driver.quit();
        
        //actualización 26062021

    }

}
