package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.KontoErstellenStep2Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KontoErstellenStep2Page_StepDefs {
    KontoErstellenStep2Page kontoErstellenStep2Page=new KontoErstellenStep2Page();
    @When("The user clicks Steuerstatus")
    public void the_user_clicks_steuerstatus() {
       kontoErstellenStep2Page.clickSteuerStatus();
    }
    @When("The user clicks NachsteButton")
    public void the_user_clicks_nachste_button() {
       kontoErstellenStep2Page.clickNachsteButton();
    }
    @Then("Verify that the warning message appears")
    public void verify_that_the_warning_message_appears() {
       kontoErstellenStep2Page.verifyWarningMessage();
    }


}
