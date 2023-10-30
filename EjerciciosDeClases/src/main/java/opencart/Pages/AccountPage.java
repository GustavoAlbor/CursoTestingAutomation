package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    private By title = By.xpath("//div[@id='content']/h1");

    private By description = By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']");

    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitulo() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }

    public Boolean descriptionIsDisplayed(){
        WebElement descriptionElem = wait.until(ExpectedConditions.visibilityOfElementLocated(description));
        return descriptionElem.isDisplayed();
    }


}
