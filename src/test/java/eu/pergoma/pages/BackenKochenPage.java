package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackenKochenPage extends BasePage{

    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(),"Hülsenfrüchte und Eingelegtes Gemüse – pergamoeu");
    }

    public void changePageOption(Integer products) {
        Driver.get().findElement(By.name("paginateBy")).click();
        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//span[@data-value='"+products+"']")),4);
        Driver.get().findElement(By.xpath("//span[@data-value='"+products+"']")).click();
    }

    public void verifyProductsNumber(Integer productsNumber) {
        Assert.assertTrue(Driver.get().findElements(By.xpath("//li[@class='product scroll-trigger animate--slide-in']")).size() <= productsNumber);
        Driver.get().navigate().refresh();
    }
}
