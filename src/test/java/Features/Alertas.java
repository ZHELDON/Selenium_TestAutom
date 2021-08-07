package Features;

import Common.BaseTest;
import Utils.SeleniumUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alertas extends BaseTest
{
    //********** INSTANCIAS *********
    WebDriverWait wait;
    SeleniumUtils utils =new SeleniumUtils();

    @Test
    public void alerts() throws Exception
    {
        //INSTANCIA DE OBJETO JAVASCRIPT
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //ACEPTAR ALERTAS
        js.executeScript("alert('UN MENSAJE DE ALERTA');");
        wait =new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.alertIsPresent());
        utils.loading(driver,1000);
        /*driver.switchTo().alert().accept();
        utils.loading(driver,1000);*/

        //DIMISS ALERT - Cancelar las alertas se cumple cuando existen los botones: cancelar, no
        String alerta= driver.switchTo().alert().getText();
        System.out.println("El texto es:"+alerta);
        driver.switchTo().alert().dismiss();

    }

}
