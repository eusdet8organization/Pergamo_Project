package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.HomePage;
import eu.pergoma.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_StepDefs {

    HomePage homePage = new HomePage();

    @When("The user navigates to Einloggen")
    public void the_user_navigates_to_einloggen() {
        homePage.navigateLogin();
    }

    @When("User scrolls to {string} and click")
    public void user_scrolls_to_and_click(String product) {
        homePage.clickProduct(product);
    }

    @When("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menu) {
        homePage.navigateMenu(menu);
    }
}
