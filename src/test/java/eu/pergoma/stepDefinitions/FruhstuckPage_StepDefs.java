package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.FruhstuckPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FruhstuckPage_StepDefs {

    FruhstuckPage fruhstuckPage = new FruhstuckPage();
    @Then("The user should see the Fruhstuck page")
    public void the_user_should_see_the_fruhstuck_page() {
        fruhstuckPage.verifyPageTitle();
    }

    @When("The user clicks {string} subCategory")
    public void the_user_clicks_sub_category(String category) {
        fruhstuckPage.clickSubCategory(category);
    }
}
