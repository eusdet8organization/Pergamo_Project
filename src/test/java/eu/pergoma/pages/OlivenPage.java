package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;

public class OlivenPage extends BasePage{

    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(),"Oliven – pergamoeu");
    }
}
