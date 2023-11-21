package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    private By FirstNameInput = By.name("firstname");
    private By LastNameInput = By.name("lastname");
    private By emailInput = By.name("email");
    private By TelephoneInput = By.name("telephone");
    private By PasswordInput = By.name("password");
    private By PasswordConfirmInput = By.name("confirm");
    private By PrivacyPolicyInput = By.name("agree");
    private By ContinueBtn = By.xpath("//input[@value='Continue']");


    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void PersonalDetails(String Firstname, String Lastname, String email, String telephone){
        sendKeys(FirstNameInput, Firstname);
        sendKeys(LastNameInput, Lastname);
        sendKeys(emailInput, email);
        sendKeys(TelephoneInput, telephone);
    }

    public void CompletePassword(String password, String confirmPassword){
        sendKeys(PasswordInput, password);
        sendKeys(PasswordConfirmInput, confirmPassword);
    }


    public void PrivacyPolicyCheck(){
        click(PrivacyPolicyInput);
    }

    public void ContinuarRegistro(){
        click(ContinueBtn);
    }

}
