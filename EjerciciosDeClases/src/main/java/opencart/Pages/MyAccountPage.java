package opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    private By title = By.xpath("//h2[text()='My Account']");
    private By CameraBtn = By.xpath("//a[text()='Cameras']");


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTitulo() {
       return getText(title);
    }

    public void ingresarACamaras(){
        click(CameraBtn);
    }

}
