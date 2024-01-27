package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public abstract void verifyPageTitle();
}

