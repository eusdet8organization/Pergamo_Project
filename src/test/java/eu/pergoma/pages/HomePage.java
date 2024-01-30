package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@type='search']")
    protected WebElement searchBox;
    @FindBy(xpath = "//h1")
    protected  WebElement results;

    public void clickProduct(String product) {
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("//a[text()='" + product + "']")));
        BrowserUtils.waitFor(5);
        Driver.get().findElement(By.xpath("//a[text()='" + product + "']")).click();

    }

    @Override
    public void verifyPageTitle() {

    }
    public void writeAndClickSearchBox(String product){
        BrowserUtils.clearAndSendKeys(searchBox,product);
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//button[@aria-label='Suchen']")));
      //  BrowserUtils.waitFor(3);
    }
    public void verifyResult(){
        Assert.assertTrue(results.getText().contains("RESULTS FOUND"));
    }
    public void verifyAnyResult(){
        Assert.assertFalse(results.isDisplayed());
    }

}
