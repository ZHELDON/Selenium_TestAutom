package Features;


import Common.BaseTestTres;
import Elements.ElementsDragAndDrop;
import Utils.SeleniumUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrog extends BaseTestTres
{
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsDragAndDrop elementsDragAndDrop = new ElementsDragAndDrop();

    @Test
    public void dragAndDrop() throws Exception
    {
        Actions action =new Actions(driver);
        //wait element -> Tarea
        Utils.clickButton(elementsDragAndDrop.OptionDroppable(driver));
        driver.switchTo().frame(0);

        action.clickAndHold(elementsDragAndDrop.Drag(driver))
                .moveToElement(elementsDragAndDrop.Drop(driver))
                .release()
                .build()
                .perform();

        Utils.loading(driver,5000);
    }


}
