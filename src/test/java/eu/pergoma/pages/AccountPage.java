package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;

public class AccountPage extends BasePage{
    @Override
    public void verifyPageTitle() {

    }
    public void verifyLogin() {
        Assert.assertEquals(Driver.get().getCurrentUrl(), "https://pergamo.eu/account");
    }
}
