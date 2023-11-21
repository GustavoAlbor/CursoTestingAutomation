package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CamerasPage extends BasePage {

    private By CanonFavBtn = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]");

    private By WishListBtn = By.xpath("//a[@id='wishlist-total']/span");

    private By CanonTitleBtn = By.xpath("//div[@class='caption']/h4/a[text()='Canon EOS 5D']");

    public CamerasPage(WebDriver driver){
        super(driver);
    }

    public void AgregarAFavoritos(){
        click(CanonFavBtn);
    }

    public void ingresarALaWishList(){
        click(WishListBtn);
    }

    public void ingresarACanonEOS(){
        click(CanonTitleBtn);
    }

}
