package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By ProductName = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left']/a");

    private By tablaCart = By.className("table-responsive");

    private By cartIsEmpty = By.xpath("//div[@id='content']/p");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public Boolean tablaIsDisplayed(){
        return isDisplayed(tablaCart);
    }

    public String NombreDelProducto(){
        return getText(ProductName);
    }

    public Boolean CartIsEmpty(){
        return isDisplayed(cartIsEmpty);
    }

}
