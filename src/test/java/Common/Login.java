package Common;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class Login
{
    //******** INSTANCIAS **********
    ElementsLogin elementsLogin =new ElementsLogin(); // Intancias la clase de elementosWeb
    SeleniumUtils seleniumUtils= new SeleniumUtils();

    public void happyPathLogin(WebDriver driver) throws Exception
    {
        //Se dá click en button SignIn
        Thread.sleep(1000); //Espera explicita
        seleniumUtils.clickButton(elementsLogin.Intologin(driver));

        //Se llena el formulario de Login
        Thread.sleep(1000); //Espera explicita
        seleniumUtils.clickButton(elementsLogin.EmailInput(driver));
        seleniumUtils.limpiarYLlenarInput(elementsLogin.EmailInput(driver),Config.user);
        seleniumUtils.clickButton(elementsLogin.PasswordInput(driver));
        seleniumUtils.limpiarYLlenarInput(elementsLogin.PasswordInput(driver),Config.password);

        //Se da click en el Button Submit para enviar el formulario
        seleniumUtils.clickButton(elementsLogin.ButtonSingIn(driver));
        Thread.sleep(3000); //Espera explicita

    }

}
