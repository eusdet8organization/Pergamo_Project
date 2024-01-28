package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.KontoErstellenStep1Page;
import io.cucumber.java.en.Then;

public class KontoErstellenStep1Page_StepDefs {
    KontoErstellenStep1Page kontoErstellenStep1Page=new KontoErstellenStep1Page();
    @Then("The user fills the Unternehmensprofil data {string} {string} {string} {string} {string}")
    public void the_user_fills_the_unternehmensprofil_data(String NameDerFirma, String Strassenadresse, String Stadt, String Land, String Postleitzahl) {
         kontoErstellenStep1Page.fiilFormWithMissingData(NameDerFirma,Strassenadresse,Stadt,Land,Postleitzahl);
    }
    @Then("Verify that the warning message")
    public void verify_that_the_warning_message() {
        kontoErstellenStep1Page.verifyWarningMessage();
    }
}
