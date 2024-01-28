package eu.pergoma.pages;

import com.github.javafaker.Faker;
import eu.pergoma.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KontoErstellenStep3Page extends BasePage {
    @Override
    public void verifyPageTitle() {
    }

    Faker faker = new Faker();
    @FindBy(xpath = "//input[@id='137131']")
    protected WebElement stimmeCheckBox;
    @FindBy(xpath = "//input[@id='554233']")
    protected WebElement vornameBox;
    @FindBy(xpath = "//input[@id='105979']")
    protected WebElement nachnameBox;
    @FindBy(xpath = "//div[@data-reach-alert='true']")
    protected WebElement errorMessage;
    @FindBy(xpath = "//input[@id='145399']")
    protected WebElement telnoBox;
    @FindBy(xpath = "//input[@id='156535']")
    protected WebElement EmailAdressBox;
    @FindBy(xpath = "//input[@id='384374']")
    protected WebElement confirmEmailAdressBox;
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement benutzerKntoBox;
    @FindBy(xpath = "//div[@data-reach-alert='true']")
    protected WebElement emailWarningMessage;
    @FindBy(xpath = "//input[@id='121294']")
    protected WebElement passwortBox;
    @FindBy(xpath = "//input[@id='707382']")
    protected WebElement confirmPasswordBox;
    @FindBy(xpath = "//div[@data-reach-alert='true']")
    protected WebElement errorPasswordMessage;
    @FindBy(tagName = "h3")
    protected WebElement accountName;


    public void checkStimmeBox() {
        stimmeCheckBox.click();
    }
    public void fillPrimaryContact(String vorname, String nachname) {
        vornameBox.sendKeys(vorname);
        nachnameBox.sendKeys(nachname);
        telnoBox.click();
    }
    public void verifyErrorMessage() {
        Assert.assertTrue(errorMessage.getText().contains("Darf nicht"));
    }
    public void enterEmail() {
        String email = faker.internet().emailAddress();
        BrowserUtils.clearAndSendKeys(EmailAdressBox, email);
    }
    public void clickBenutzerkontoEBox() {
        benutzerKntoBox.click();
    }
    public void verifyEmailWarningMessage() {
        Assert.assertTrue(emailWarningMessage.getText().contains("E-Mail-Adresse übereinstimmen"));
    }
    public void entersEmailAndConfirmEmail() {
        String email = faker.internet().emailAddress();
        BrowserUtils.clearAndSendKeys(EmailAdressBox, email);
        BrowserUtils.clearAndSendKeys(confirmEmailAdressBox, email);
    }
    public void entersPassword(String password) {
        passwortBox.sendKeys(password);
        confirmPasswordBox.click();
    }
    public void verifyErrorPasswordMessage() {
        Assert.assertTrue(errorPasswordMessage.getText().contains("is too short"));
    }
    public void enterPasswordAndConfrmPassword(String password) {
        passwortBox.sendKeys(password);
        confirmPasswordBox.sendKeys(password);
        benutzerKntoBox.click();
    }
    public void verifySuccessRegistration(){
        Assert.assertTrue(accountName.getText().contains(vornameBox.getText()));
    }
}