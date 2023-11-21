package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{

    private By title = By.xpath("//div[@id='content']/h1");

    private By description = By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']");


    public AccountPage(WebDriver driver){
        super(driver);
    }

    public String getTitulo() {
        return getText(title);
    }

    public Boolean descriptionIsDisplayed(){
        return isDisplayed(description);
    }


}
