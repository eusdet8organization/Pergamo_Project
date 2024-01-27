package eu.pergoma.stepDefinitions;

import eu.pergoma.pages.ProductPage;
import io.cucumber.java.en.Then;


public class ProductPage_StepDefs {
    ProductPage productPage = new ProductPage();


    @Then("Verify that the user can see products infos")
    public void verify_that_the_user_can_see_products_infos() {
        productPage.verifyProductInfo();
    }

    @Then("Verify that the user can read product comments")
    public void verify_that_the_user_can_read_product_comments() {
        productPage.verifyProductComments();
    }

    @Then("Verify that the user can select product quantity")
    public void verify_that_the_user_can_select_product_quantity() {
        productPage.verifyProductQuantity();
    }

    @Then("Verify that the user can see product details")
    public void verify_that_the_user_can_see_product_details() {
        productPage.verifyProductDetails();
    }

    @Then("Verify that user can see products photos")
    public void verify_that_user_can_see_products_photos() {

    }

}
