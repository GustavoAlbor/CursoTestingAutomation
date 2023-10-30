package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HomePage {

    private By title = By.xpath("//div[@id='logo']/h1/a");
    private By search = By.name("search");
    private By carrousel = By.id("slideshow0");

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']"); //a[contains(@href, 'account/login')]

    private By RegisterBtn = By.xpath("//a[contains(@href, 'account/register')]");

    private By WishListBtn = By.xpath("//a[@id='wishlist-total']/span");

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ingresarAlLogin() {
        WebElement myAccountBtnElem = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountBtnElem.click();

        WebElement loginBtnElem = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtnElem.click();
    }

    public String getTitulo() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }

    public Boolean buscadorEsVisible() {
        WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        return searchElement.isDisplayed();
    }

    public Boolean carrouselEsVisible() {
        WebElement carrouselElement = wait.until(ExpectedConditions.visibilityOfElementLocated(carrousel));
        return carrouselElement.isDisplayed();
    }

    public void ingresarAlRegister(){
        WebElement myAccountBtnElem = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountBtnElem.click();

        WebElement RegisterBtnElement = wait.until(ExpectedConditions.elementToBeClickable(RegisterBtn));
        RegisterBtnElement.click();
    }

    public void ingresarALaWishList(){
        WebElement WishListElem = wait.until(ExpectedConditions.elementToBeClickable(WishListBtn));
        WishListElem.click();
    }

}
