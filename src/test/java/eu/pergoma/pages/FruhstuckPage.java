package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FruhstuckPage extends BasePage{
    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(),"Frühstücksartikel – pergamoeu");
    }

    public void clickSubCategory(String category) {
        Driver.get().findElement(By.xpath("//li[@class='navPages-item']//span[.='"+category+"']")).click();
    }
}
