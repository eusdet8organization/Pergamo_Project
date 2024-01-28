package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPage_StepDefs {

    AccountPage accountPage = new AccountPage();

    @Then("Verify that the user has logged in successfully")
    public void verify_that_the_user_has_logged_in_successfully() {
        accountPage.verifyLogin();
    }


    @When("The user clicks on account button")
    public void the_user_clicks_on_account_button() {
        accountPage.clickAccount();
    }

    @When("The user clicks on {string} button")
    public void the_user_clicks_on_button(String labelName) {
        accountPage.clickAddressLabel(labelName);
    }
}
