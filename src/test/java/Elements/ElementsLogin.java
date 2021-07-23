package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    public By byIntoLogin= By.xpath("//div/a[@class='login']");
    public WebElement Intologin(WebDriver driver) {
        WebElement intoLogin = driver.findElement(byIntoLogin);
        return intoLogin;
    }

    public By byEmailInput =By.id("email");
    public WebElement EmailInput(WebDriver driver){
        WebElement emailInput = driver.findElement(byEmailInput);
        return emailInput;
    }

    public By byPasswordInput =By.id("passwd");
    public WebElement PasswordInput(WebDriver driver){
        WebElement passwordInput = driver.findElement(byPasswordInput);
        return passwordInput;
    }

    public By byButtonSingIn =By.id("SubmitLogin");
    public WebElement ButtonSingIn(WebDriver driver){
        WebElement buttonSingIn = driver.findElement(byButtonSingIn);
        return buttonSingIn;
    }

    //3 ELEMENTO TAP WOMAN
    public By byTapWoman = By.partialLinkText("Women");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement  tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    //4 ELEMENTO BOTON PRUEBA
    public By byBotonPrueba = By.xpath("test");
    public WebElement BtnPruba (WebDriver driver)
    {
        WebElement  btnPrueba= driver.findElement(byBotonPrueba);
        return btnPrueba;
    }

}
