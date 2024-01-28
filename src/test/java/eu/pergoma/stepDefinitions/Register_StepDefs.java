package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_StepDefs {
    RegisterPage registerPage=new RegisterPage();
    @When("The user clicks Einloggen button")
    public void the_user_clicks_einloggen_button() {
     registerPage.clickEinloggenButton();
    }
    @Then("Verify that the Benutzerkonto Erstellen button appears")
    public void verify_that_the_benutzerkonto_erstellen_button_appears() {
     registerPage.verifyBKEButtnIsDispyed();
    }
    @Then("The user clicks Benutzerkonto Erstellen button")
    public void the_user_clicks_benutzerkonto_erstellen_button() {
     registerPage.clickBKEButtn();
    }
    @Then("Verify that the Konto Erstellen page is opened")
    public void verify_that_the_konto_erstellen_page_is_opened() {
     registerPage.verifyKontoErstellenPageIsOpened();
    }
}
