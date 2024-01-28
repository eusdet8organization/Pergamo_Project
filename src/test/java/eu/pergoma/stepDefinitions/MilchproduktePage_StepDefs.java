package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.MilchproduktePage;
import io.cucumber.java.en.Then;

public class MilchproduktePage_StepDefs {

    MilchproduktePage milchproduktePage = new MilchproduktePage();

    @Then("The user should see the Milchprodukte page")
    public void the_user_should_see_the_milchprodukte_page() {
        milchproduktePage.verifyPageTitle();
    }
}
