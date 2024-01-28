package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KontoErstellenStep1Page extends BasePage{

    @Override
    public void verifyPageTitle() {
    }
    @FindBy(xpath = "//input[@id='105435']")
    protected WebElement nameDerFirmaBox;
    @FindBy(xpath = "//input[@id='549449']")
    protected WebElement strassenAdresseBox;
    @FindBy(xpath = "//input[@id='115461']")
    protected WebElement stadtBox;
    @FindBy(xpath = "//select[@id='143607']")
    protected WebElement wahlenLandDropDown;
    @FindBy(xpath = "//input[@id='649081']")
    protected WebElement postleitzahlBox;
    @FindBy(xpath = "//span[.='Nächste']")
    protected WebElement nachsteButton;
    @FindBy(className = "cf-field-error-list")
    protected WebElement warningMessage;

    public void fiilFormWithMissingData(String NameDerFirma,String Strassenadresse,String Stadt,String Land,String Postleitzahl) {
        BrowserUtils.clickWithJS(nameDerFirmaBox);
        BrowserUtils.clearAndSendKeys(nameDerFirmaBox, NameDerFirma);
        BrowserUtils.clickWithJS(strassenAdresseBox);
        BrowserUtils.clearAndSendKeys(strassenAdresseBox, Strassenadresse);
        BrowserUtils.scrollToElement(postleitzahlBox);
        BrowserUtils.clickWithJS(stadtBox);
        BrowserUtils.clearAndSendKeys(stadtBox, Stadt);
        wahlenLandDropDown.click();
        Driver.get().findElement(By.xpath("//select/option[.='"+Land+"']")).click();
        BrowserUtils.clickWithJS(postleitzahlBox);
        BrowserUtils.clearAndSendKeys(postleitzahlBox, Postleitzahl);
        BrowserUtils.clickWithJS(nachsteButton);
    }
    public void verifyWarningMessage(){
        Assert.assertTrue(warningMessage.getText().contains("darf nicht leer"));
    }
}
