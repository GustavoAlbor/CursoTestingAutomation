package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {

    By tabla = By.xpath("//div[@class='table-responsive']");

    WebDriver driver;
    WebDriverWait wait;

    public WishListPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean ProductFavIsDisplayed(){
        WebElement tablaElem = wait.until(ExpectedConditions.visibilityOfElementLocated(tabla));
       return tablaElem.isDisplayed();
    }

}
