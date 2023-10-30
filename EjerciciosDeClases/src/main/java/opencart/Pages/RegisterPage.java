package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class RegisterPage {

    private By FirstNameInput = By.name("firstname");
    private By LastNameInput = By.name("lastname");
    private By emailInput = By.name("email");
    private By TelephoneInput = By.name("telephone");
    private By PasswordInput = By.name("password");
    private By PasswordConfirmInput = By.name("confirm");
    private By PrivacyPolicyInput = By.name("agree");
    private By ContinueBtn = By.xpath("//input[@value='Continue']");

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void PersonalDetails(String Firstname, String Lastname, String email, String telephone){
        WebElement FirstNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameInput));
        FirstNameElem.sendKeys(Firstname);

        WebElement LastNameElem = wait.until(ExpectedConditions.visibilityOfElementLocated(LastNameInput));
        LastNameElem.sendKeys(Lastname);

        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailElement.sendKeys(email);

        WebElement TelephoneElem = wait.until(ExpectedConditions.visibilityOfElementLocated(TelephoneInput));
        TelephoneElem.sendKeys(telephone);
    }

    public void CompletePassword(String password, String confirmPassword){
        WebElement PasswordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordInput));
        PasswordElem.sendKeys(password);

        WebElement ConfirmPasswordElem = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordConfirmInput));
        ConfirmPasswordElem.sendKeys(confirmPassword);
    }


    public void PrivacyPolicyCheck(){
        WebElement PrivacyPolicyBtnElem = wait.until(ExpectedConditions.elementToBeClickable(PrivacyPolicyInput));
        PrivacyPolicyBtnElem.click();
    }

    public void ContinuarRegistro(){
        WebElement ContinueBtnElem = wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
        ContinueBtnElem.click();
    }

}
