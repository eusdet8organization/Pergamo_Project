package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class='productView-desc halo-text-format']")
    private WebElement productInfoLabel;

    @FindBy(id = "quantity-8218309001518")
    private WebElement productQuantity;

    @Override
    public void verifyPageTitle() {

    }

    public void verifyProductInfo() {
        Assert.assertTrue(productInfoLabel.getText().contains("600 gr Ezine"));
    }

    public void verifyProductComments() {
    }

    public void verifyProductQuantity() {
        Assert.assertEquals(productQuantity.getAttribute("value"), "1");

    }

    public void verifyProductDetails() {
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("//a[contains(text(),'Beschreibung')]")));
        Assert.assertTrue(Driver.get().findElement(By.xpath("//p[contains(text(),'Käsesorten')]")).getText().contains("Käsesorten"));
    }
}
