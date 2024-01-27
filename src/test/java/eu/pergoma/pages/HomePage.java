package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {




    public void clickProduct(String product) {
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("a[text()='" + product + "')]")));
        Driver.get().findElement(By.xpath("a[text()='" + product + "')]")).click();
    }

    @Override
    public void verifyPageTitle() {

    }
}
