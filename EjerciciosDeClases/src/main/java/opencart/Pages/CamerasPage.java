package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CamerasPage {

    private By CanonFavBtn = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]");

    WebDriver driver;
    WebDriverWait wait;

    public CamerasPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void AgregarAFavoritos(){
        WebElement CanonFavElement = wait.until(ExpectedConditions.elementToBeClickable(CanonFavBtn));
        CanonFavElement.click();
    }

}
