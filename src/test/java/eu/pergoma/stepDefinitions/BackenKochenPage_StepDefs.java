package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.BackenKochenPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackenKochenPage_StepDefs {

    BackenKochenPage backenKochenPage = new BackenKochenPage();

    @Then("The user should see the BackenKochen page")
    public void the_user_should_see_the_BackenKochen_page() {
        backenKochenPage.verifyPageTitle();
    }

    @When("The user changes the option in ARTIKEL PRO SEITE to {int}")
    public void the_user_changes_the_option_in_artikel_pro_seite_to(Integer products) {
        backenKochenPage.changePageOption(products);
    }
    @Then("The user should see a maximum of {int} articles on the page")
    public void the_user_should_see_a_maximum_of_articles_on_the_page(Integer productsNumber) {
        backenKochenPage.verifyProductsNumber(productsNumber);
    }
}
