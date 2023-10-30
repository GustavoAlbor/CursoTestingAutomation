package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    private By title = By.xpath("//h2[text()='My Account']");

    private By CameraBtn = By.xpath("//a[text()='Cameras']");

    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getTitulo() {
        WebElement titleElem = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElem.getText();
    }

    public void ingresarACamaras(){
        WebElement CameraBtnElem = wait.until(ExpectedConditions.elementToBeClickable(CameraBtn));
        CameraBtnElem.click();
    }

}
