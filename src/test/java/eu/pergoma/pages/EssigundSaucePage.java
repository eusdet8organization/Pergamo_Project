package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;

public class EssigundSaucePage extends BasePage{
    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(),"Essig und Sauce – pergamoeu");
    }
}
