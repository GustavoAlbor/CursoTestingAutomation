package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    By ElemFav = By.xpath("//div[@id='content']/div/table/tbody/tr/td[@class='text-left']/a");

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public boolean ProductFavIsDisplayed(){
       return isDisplayed(ElemFav);
    }

    public String ElemFavName(){
        return getText(ElemFav);
    }

}
