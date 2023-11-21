package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class CanonPage extends BasePage{

    private By selectBtn = By.xpath("//select[@name='option[226]']");

//    private By optionRed = By.xpath("//select[@name='option[226]']/option[@value='15']");

    private By addCartBtn = By.id("button-cart");

    private By addCartAlert = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    private By CartBtn = By.xpath("//div[@id='cart']/button[@type='button']");

    private By ViewCartBtn = By.xpath("//a[contains(@href, 'checkout/cart')]/strong");


    public CanonPage(WebDriver driver) {
        super(driver);
    }

    public void SeleccionarColor(String opcion){
       selectOptions(selectBtn,opcion);
    }

    public void AgregarACarrito(){
        click(addCartBtn);
    }

    public void IngresarAlCarrito(){
        click(CartBtn);
        click(ViewCartBtn);
    }

    public Boolean AddCartAlertEsVisible(){
        return isDisplayed(addCartAlert);
    }
}
