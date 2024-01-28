package eu.pergoma.pages;

import eu.pergoma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class NusseKernePage extends BasePage{
    @Override
    public void verifyPageTitle() {
        Assert.assertEquals(Driver.get().getTitle(),"Nüsse & Kerne – pergamoeu");
    }
}
