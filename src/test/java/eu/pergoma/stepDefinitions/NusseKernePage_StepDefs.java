package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.NusseKernePage;
import io.cucumber.java.en.Then;

public class NusseKernePage_StepDefs {

    NusseKernePage nusseKernePage = new NusseKernePage();
    @Then("The user should see the NusseKerne page")
    public void the_user_should_see_the_nusse_kerne_page() {
        nusseKernePage.verifyPageTitle();
    }
}
