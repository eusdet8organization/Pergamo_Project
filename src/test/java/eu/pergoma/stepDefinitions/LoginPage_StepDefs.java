package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefs {

    LoginPage loginPage = new LoginPage();
    @When("The user logs in with credentials {string} and {string}")
    public void the_user_logs_in_with_credentials_and(String email, String password) {
        loginPage.login(email, password);
    }
    @Then("Verify warning Email {string} message")
    public void verify_warning_email_message(String message) {
        loginPage.verifyEmailWarning(message);
    }
    @Then("Verify warning Password {string} message")
    public void verify_warning_password_message(String message) {
        loginPage.verifyPasswordWarning(message);
    }
    @Then("Verify warning Email or Password {string} message")
    public void verify_warning_email_or_password_message(String message) {
        loginPage.verifyEmailPasswordWarning(message);
    }
}
