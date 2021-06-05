package MiprimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.get("https://www.amazon.com/");

    } //Termina la configuracion del navegador

    @Test
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
    }

    @After
    public void tearDown()
    {
        //Cierra la instancia del navegador
        //driver.quit();
    }

}
