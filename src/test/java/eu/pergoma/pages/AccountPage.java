package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{


    @Override
    public void verifyPageTitle() {

    }

    public void clickAddressLabel(String labelName){
        WebElement addressLabel = Driver.get().findElement(By.xpath("//span[text()='" + labelName + "']"));
        addressLabel.click();
    }

    public void verifyLogin() {
        Assert.assertEquals(Driver.get().getCurrentUrl(), "https://pergamo.eu/account");
    }
}
