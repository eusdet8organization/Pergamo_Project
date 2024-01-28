@regression @product
Feature: User See Product Details

  Scenario: TC_14-01_User See Product Details
    When User scrolls to "Käse Vorteilspaket" and click
    Then Verify that the user can see products infos
    Then Verify that the user can read product comments
    Then Verify that the user can select product quantity
    Then Verify that the user can see product details
    Then Verify that user can see products photos
