package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.EssigundSaucePage;
import io.cucumber.java.en.Then;

public class EssigundSaucePage_StepDefs {

    EssigundSaucePage essigundSaucePage = new EssigundSaucePage();
    @Then("The user should see the Essig und Sauce page")
    public void the_user_should_see_the_essig_und_sauce_page() {
        essigundSaucePage.verifyPageTitle();
    }
}
