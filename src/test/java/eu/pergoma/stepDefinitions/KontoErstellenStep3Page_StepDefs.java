package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.KontoErstellenStep3Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KontoErstellenStep3Page_StepDefs {

    KontoErstellenStep3Page kontoErstellenStep3Page=new KontoErstellenStep3Page();
    @When("The user checks the Stimme Button")
    public void the_user_checks_the_stimme_button() {
         kontoErstellenStep3Page.checkStimmeBox();
    }
    @When("The user fills the primary contact data {string} {string}")
    public void the_user_fills_the_primary_contact_data(String Vorname, String Nachname) {
         kontoErstellenStep3Page.fillPrimaryContact(Vorname,Nachname);
    }
    @Then("Verify that error message")
    public void verify_that_error_message() {
         kontoErstellenStep3Page.verifyErrorMessage();
    }
    @When("The user enters Email")
    public void the_user_enters_email() {
         kontoErstellenStep3Page.enterEmail();
    }
    @When("The user clicks benutzerkontoEBox")
    public void the_user_clicks_benutzerkonto_e_box() {
         kontoErstellenStep3Page.clickBenutzerkontoEBox();
    }
    @Then("Verify that Email warning message")
    public void verify_that_email_warning_message() {
         kontoErstellenStep3Page.verifyEmailWarningMessage();
    }
    @When("The user enters Email ,ConfirmEmail")
    public void the_user_enters_email_confirm_email() {
         kontoErstellenStep3Page.entersEmailAndConfirmEmail();
    }
    @When("The user enters less than sex character {string}")
    public void the_user_enters_less_than_sex_character(String password) {
         kontoErstellenStep3Page.entersPassword(password);
    }
    @Then("Verify that indicatorWarningMessage appears")
    public void verify_that_indicator_warning_message_appears() {
         kontoErstellenStep3Page.verifyErrorPasswordMessage();
    }
    @When("The user enters Password ,ConfirmPassword {string}")
    public void the_user_enters_password_confirm_password(String password) {
         kontoErstellenStep3Page.enterPasswordAndConfrmPassword(password);
    }
    @Then("Verify that success registration")
    public void verify_that_success_registration() {
         kontoErstellenStep3Page.verifySuccessRegistration();
    }
}
