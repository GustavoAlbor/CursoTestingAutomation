package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By title = By.xpath("//div[@id='logo']/h1/a");
    private By search = By.name("search");
    private By carrousel = By.id("slideshow0");

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']"); //a[contains(@href, 'account/login')]

    private By RegisterBtn = By.xpath("//a[contains(@href, 'account/register')]");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ingresarAlLogin() {
        click(myAccountBtn);
        click(loginBtn);
    }

    public String getTitulo() {
        return getText(title);
    }

    public Boolean buscadorEsVisible() {
        return isDisplayed(search);
    }

    public Boolean carrouselEsVisible() {
        return isDisplayed(carrousel);
    }

    public void ingresarAlRegister(){
        click(myAccountBtn);
        click(RegisterBtn);
    }


}
