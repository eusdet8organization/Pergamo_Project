package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.OlivenPage;
import io.cucumber.java.en.Then;

public class OlivenPage_StepDefs {

    OlivenPage olivenPage = new OlivenPage();
    @Then("The user should see the Oliven page")
    public void the_user_should_see_the_oliven_page() {
        olivenPage.verifyPageTitle();
    }
}
