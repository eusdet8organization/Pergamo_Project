package eu.pergoma.pages;

import eu.pergoma.utilities.BrowserUtils;
import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {

    @FindBy(xpath = "//h2[contains (text(), 'Customer')]")
    private WebElement customerAddressBookLabel;

    @FindBy(xpath = "//button[@aria-label='Edit address 1']")
    private WebElement editButton;

    @FindBy(xpath = " //button[text()='Update address']")
    private WebElement updateAddressButton;

    @FindBy(id = "AddressAddress1_10018235842893")
    private WebElement address1Box;

    @FindBy(id = "AddressAddress2_10018235842893")
    private WebElement address2Box;
    @FindBy(id = "AddressCity_10018235842893")
    private WebElement cityBox;

    @FindBy(id = "AddressZip_10018235842893")
    private WebElement postCodeBox;

    @FindBy(xpath = "//button[contains(text(),'new address')]")
    private WebElement newAddressButton;
    @FindBy(xpath = "//button[text()='Add address']")
    private WebElement addAddressButton;

    @FindBy(id = "AddressFirstNameNew")
    private WebElement firstnameBox;
    @FindBy(id = "AddressLastNameNew")
    private WebElement lastnameBox;
    @FindBy(id = "AddressCompanyNew")
    private WebElement companyBox;

    @FindBy(xpath = "//button[@aria-label='Remove 2']")
    private WebElement remove2Button;

    public void clickEditButton() {
        editButton.click();
    }

    public void clickUpdateAddressButton() {
        updateAddressButton.click();
    }

    public void updateAddress(String address1, String address2, String city, String postCode) {
        BrowserUtils.clearAndSendKeys(address1Box, address1);
        BrowserUtils.clearAndSendKeys(address2Box, address2);
        BrowserUtils.clearAndSendKeys(cityBox, city);
        BrowserUtils.clearAndSendKeys(postCodeBox, postCode);
    }

    public void addNewAddress(String firstname, String lastname, String company, String address1, String address2, String city, String postCode) {
        BrowserUtils.clearAndSendKeys(firstnameBox, firstname);
        BrowserUtils.clearAndSendKeys(lastnameBox, lastname);
        BrowserUtils.clearAndSendKeys(companyBox, company);
        BrowserUtils.clearAndSendKeys(address1Box, address1);
        BrowserUtils.clearAndSendKeys(address2Box, address2);
        BrowserUtils.clearAndSendKeys(cityBox, city);
        BrowserUtils.clearAndSendKeys(postCodeBox, postCode);
    }

    public void clickNewAddress() {
        newAddressButton.click();
    }

    public void clickRemoveButton() {
        remove2Button.click();
    }

    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(), "https://pergamo.eu/account/addresses");
    }


}
