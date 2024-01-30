package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchIcon_StepDefs {
    HomePage homePage=new HomePage();
    @When("The user writes {string} in Search Box")
    public void the_user_writes_in_search_box(String product) {
        homePage.writeAndClickSearchBox(product);
    }
    @Then("Verify that result appears")
    public void verify_that_result_appears() {
        homePage.verifyResult();
    }

    @Then("Verify that result appears not")
    public void verifyThatResultAppearsNot() {
        homePage.verifyAnyResult();
    }
}
