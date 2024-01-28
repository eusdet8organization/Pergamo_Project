package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='customer-links']")
    protected WebElement loginButton;

    @FindBy (xpath = "//a[@class='header__icon header__icon--account link link--text']")
    protected WebElement accountLabel;

    public abstract void verifyPageTitle();


    public void navigateLogin() {
        loginButton.click();
    }


    public void clickAccount(){
        accountLabel.click();
    }

    public void navigateMenu(String menu) {
        Driver.get().findElement(By.xpath("(//span[.='"+menu+"'])[1]")).click();
    }
}

