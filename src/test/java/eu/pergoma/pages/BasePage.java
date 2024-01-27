package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='customer-links']")
    protected WebElement loginButton;

    @FindBy (className = "header-mobile__item header-mobile__item--customer")
    private WebElement accountLabel;

    public abstract void verifyPageTitle();


    public void navigateLogin() {
        loginButton.click();
    }


    public void clickAccount(){
        accountLabel.click();
    }
}

