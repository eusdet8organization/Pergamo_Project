package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @Override
    public void verifyPageTitle() {
    }
    @FindBy(xpath = "//span[.='Einloggen']")
    protected WebElement einLoggenButton;
    @FindBy(xpath = "//a[.='Benutzerkonto erstellen']")
    protected WebElement benutzerKontoErstellenButton;
    @FindBy(xpath = "//span[.='Konto erstellen']")
    protected WebElement kontoErstellenPageName;
    public void clickEinloggenButton(){
        BrowserUtils.clickWithJS(einLoggenButton);
    }
    public void verifyBKEButtnIsDispyed(){
        BrowserUtils.waitForVisibility(benutzerKontoErstellenButton,3);
        Assert.assertTrue(benutzerKontoErstellenButton.isDisplayed());
    }
    public void clickBKEButtn(){
        BrowserUtils.clickWithJS(benutzerKontoErstellenButton);
    }
    public void verifyKontoErstellenPageIsOpened(){
        Assert.assertEquals(kontoErstellenPageName.getText(),"Konto Erstellen");
    }
}
