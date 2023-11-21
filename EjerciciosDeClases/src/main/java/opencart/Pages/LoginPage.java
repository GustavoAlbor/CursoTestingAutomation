package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginForm = By.xpath("//input[@type='submit' and @value='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        sendKeys(emailInput, username);
        sendKeys(passwordInput, password);
        click(loginForm);
    }

}
