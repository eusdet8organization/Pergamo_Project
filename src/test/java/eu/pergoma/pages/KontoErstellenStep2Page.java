package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KontoErstellenStep2Page extends BasePage{

    @Override
    public void verifyPageTitle() {

    }
    @FindBy(id = "value1-782613option1")
    protected WebElement neinRadioButton;
    @FindBy(xpath = "//span[.='Nächste']")
    protected WebElement nachsteButton;
    @FindBy(xpath = "//b[contains(text(), 'Ich stimme ')]")
    protected WebElement warningMessage;

    public void clickSteuerStatus(){
        BrowserUtils.clickWithJS(neinRadioButton);
    }
    public void clickNachsteButton(){
        BrowserUtils.clickWithJS(nachsteButton);
    }
    public void verifyWarningMessage(){
        Assert.assertTrue(warningMessage.getText().contains("Ich stimme den"));
    }

}
