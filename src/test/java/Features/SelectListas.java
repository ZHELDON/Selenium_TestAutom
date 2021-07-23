package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

}
