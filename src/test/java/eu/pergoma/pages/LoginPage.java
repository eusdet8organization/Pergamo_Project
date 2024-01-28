package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @Override
    public void verifyPageTitle() {
    }

    @FindBy(id = "customer_email")
    protected WebElement emailBox;

    @FindBy(id = "customer_password")
    protected WebElement passwordBox;

    @FindBy(xpath = "//input[@value='Anmeldung']")
    protected WebElement loginButton;

    @FindBy(className = "alertBox-message")
    protected WebElement warningMessage;
    public void login(String email, String password) {
        BrowserUtils.clearAndSendKeys(emailBox, email);
        BrowserUtils.clearAndSendKeys(passwordBox, password);
        loginButton.click();
        BrowserUtils.waitFor(20);
    }

    public void verifyEmailWarning(String message) {
        Assert.assertEquals(emailBox.getAttribute("validationMessage"), message);
    }
    public void verifyPasswordWarning(String message) {
        Assert.assertEquals(passwordBox.getAttribute("validationMessage"), message);
    }

    public void verifyEmailPasswordWarning(String message) {
        Assert.assertTrue(warningMessage.getText().contains(message));
    }
}
