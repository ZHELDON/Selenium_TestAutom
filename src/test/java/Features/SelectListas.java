package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectListas extends BaseTest
{
    //******** INSTANCIAS ***********
    SeleniumUtils seleniumUtils=new SeleniumUtils();
    ElementsSelects elementsSelects=new ElementsSelects();

    @Test
    public void listaConClicks () throws  Exception
    {
        //SE VALIDA LA PRESENCIA DEL ELEMENTO TOPWOMAN
        seleniumUtils.waitElement(driver,elementsSelects.byTapWoman);

        //SE DA CLIC EN EL ELEMENTO TAP WOMAN
        seleniumUtils.clickButton(elementsSelects.TapWoman(driver));
        seleniumUtils.loading(driver, 3000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        seleniumUtils.waitElement(driver, elementsSelects.bybottonMasTops);

        //SE DA CLIC EN EL ELEMENTO OPCION TOPS
        seleniumUtils.clickButton(elementsSelects.BottonMasTops(driver));
        seleniumUtils.loading(driver, 2000);

        //SE VALIDA LA PRESENCIA DEL ELEMENTO "T SHIRTS"
        seleniumUtils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //SE DA CLIC EN EL ELEMENTO "T SHIRTS"
        seleniumUtils.clickButton(elementsSelects.BottonTSshirts(driver));

        //*****SELECCIONAR OPCIONES DE UNA LISTA CON CLICKS********
        /*ESTA OPCION POR BUENAS PRACTICAS NO SE UTILIZA*/

        //SE VALIDA LA PRESENCIA DEL ELEMENTO "LISTA SORT"
        seleniumUtils.waitElement(driver, elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA SORT
        seleniumUtils.clickButton(elementsSelects.SelectSort(driver));

        String opcionEsperada ="In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option=driver.findElement(By.xpath(opcionBuscar));

        option.click();

    }

    @Test
    public void ListaConSendKeys() throws Exception
    {
        //1 SE VALIDA LA PRESENCIA DEL ELEMENTO TOPWOMAN
        seleniumUtils.waitElement(driver,elementsSelects.byTapWoman);

        //2 SE DA CLIC EN EL ELEMENTO TAP WOMAN
        seleniumUtils.clickButton(elementsSelects.TapWoman(driver));
        seleniumUtils.loading(driver, 3000);

        //3 SE VALIDA LA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        seleniumUtils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 SE DA CLIC EN EL ELEMENTO OPCION TOPS
        seleniumUtils.clickButton(elementsSelects.BottonMasTops(driver));
        seleniumUtils.loading(driver, 2000);

        //5 SE VALIDA LA PRESENCIA DEL ELEMENTO "T SHIRTS"
        seleniumUtils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 SE DA CLIC EN EL ELEMENTO "T SHIRTS"
        seleniumUtils.clickButton(elementsSelects.BottonTSshirts(driver));

        //*********** MANEJO DE lISTAS CON sendkeys *************
        //Esta Opción es Aceptable

        seleniumUtils.waitElement(driver, elementsSelects.bySelectSort);
        seleniumUtils.loading(driver,2000);

        String opcionEsperada = "Product Name: A to Z";
        elementsSelects.SelectSort(driver).sendKeys(opcionEsperada);
        seleniumUtils.loading(driver,3000);


    }

    @Test
    public void listaUsandoClase() throws Exception
    {
        //1 SE VALIDA LA PRESENCIA DEL ELEMENTO TOPWOMAN
        seleniumUtils.waitElement(driver,elementsSelects.byTapWoman);

        //2 SE DA CLIC EN EL ELEMENTO TAP WOMAN
        seleniumUtils.clickButton(elementsSelects.TapWoman(driver));
        seleniumUtils.loading(driver, 3000);

        //3 SE VALIDA LA PRESENCIA DEL ELEMENTO MAS DE LA OPCION TOPS
        seleniumUtils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 SE DA CLIC EN EL ELEMENTO OPCION TOPS
        seleniumUtils.clickButton(elementsSelects.BottonMasTops(driver));
        seleniumUtils.loading(driver, 2000);

        //5 SE VALIDA LA PRESENCIA DEL ELEMENTO "T SHIRTS"
        seleniumUtils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 SE DA CLIC EN EL ELEMENTO "T SHIRTS"
        seleniumUtils.clickButton(elementsSelects.BottonTSshirts(driver));

        //*********** MANEJO DE lISTAS CON Clases *************
        //Esta Opción es Aceptable

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        seleniumUtils.loading(driver,1000);

        seleniumUtils.waitElement(driver, elementsSelects.bySelectSort);
        seleniumUtils.loading(driver,2000);

        String opcionEsperada = "In stock";
        elementsSelects.SelectSort(driver);
        Select selectLista = new Select(elementsSelects.SelectSort(driver));
        selectLista.selectByVisibleText(opcionEsperada); // cuando el objeto es visible

    }

}
