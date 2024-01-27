package eu.pergoma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

@FindBy (xpath = "//div[contains(text(),'600 gr Ezine...')]")
private WebElement productInfoLabel;

    @FindBy (className = "productView-desc halo-text-format")
    private WebElement productInfoLabel1;



    @Override
    public void verifyPageTitle() {

    }
}
