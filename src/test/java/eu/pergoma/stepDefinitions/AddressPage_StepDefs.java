package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.AddressPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressPage_StepDefs {

    AddressPage addressPage = new AddressPage();


    @Then("Verify that the user is on the Address page")
    public void verify_that_the_user_is_on_the_address_page() {
        addressPage.verifyPageTitle();
    }

    @When("The user clicks on edit button")
    public void the_user_clicks_on_edit_button() {
        addressPage.clickEditButton();
    }

    @When("The user updates the fields {string}, {string}, {string},  {string}")
    public void the_user_updates_the_fields(String address1, String address2, String city, String postCode) {
        addressPage.updateAddress(address1, address2, city, postCode);
    }

    @When("The user clicks on update Address button")
    public void the_user_clicks_on_update_address_button() {
        addressPage.clickUpdateAddressButton();
    }

    @When("The user clicks on add a new address button")
    public void the_user_clicks_on_add_a_new_address_button() {
        addressPage.clickNewAddress();
    }

    @When("The user updates the fields {string}, {string}, {string}, {string}, {string}, {string},  {string}")
    public void the_user_updates_the_fields(String firstname, String lastname, String company, String address1, String address2, String city, String postCode) {
        addressPage.addNewAddress(firstname, lastname, company, address1, address2, city, postCode);
    }

    @When("The user clicks on add Address button")
    public void the_user_clicks_on_add_address_button() {
        addressPage.clickNewAddress();
    }

    @When("The user clicks on remove button")
    public void the_user_clicks_on_remove_button() {
        addressPage.clickRemoveButton();
    }
}
