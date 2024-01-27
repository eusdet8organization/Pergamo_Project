package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.AccountPage;
import io.cucumber.java.en.Then;

public class AccountPage_StepDefs {

    AccountPage accountPage = new AccountPage();

    @Then("Verify that the user has logged in successfully")
    public void verify_that_the_user_has_logged_in_successfully() {
        accountPage.verifyLogin();
    }
}
