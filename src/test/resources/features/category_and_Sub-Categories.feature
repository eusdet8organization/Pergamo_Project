@regression @category
Feature: Category and Sub-Categories Tests
  @jenkins
  Scenario: TC_0601-Navigate a Category Without Login
    When The user navigates to "Frühstück" menu
    Then The user should see the Fruhstuck page
    When The user navigates to "Backen & Kochen" menu
    Then The user should see the BackenKochen page
    When The user navigates to "Nüsse & Kerne" menu
    Then The user should see the NusseKerne page
  @jenkins
  Scenario: TC_0602-Navigate a Sub-Category Without Login
    When The user navigates to "Frühstück" menu
    And  The user clicks "Milchprodukte" subCategory
    Then The user should see the Milchprodukte page
    When The user clicks "Essig und Sauce" subCategory
    Then The user should see the Essig und Sauce page
    When The user clicks "Oliven" subCategory
    Then The user should see the Oliven page

  Scenario: TC_0603-Navigate the Category With Login
    When The user navigates to Einloggen
    And The user logs in with credentials "testfirma@gmail.com" and "testFirma"
    Then Verify that the user has logged in successfully
    When The user navigates to "Frühstück" menu
    Then The user should see the Fruhstuck page
    When The user navigates to "Backen & Kochen" menu
    Then The user should see the BackenKochen page
    When The user navigates to "Nüsse & Kerne" menu
    Then The user should see the NusseKerne page

  Scenario: TC_0604-Navigate the Sub-Category With Login
    When The user navigates to Einloggen
    And The user logs in with credentials "testfirma@gmail.com" and "testFirma"
    Then Verify that the user has logged in successfully
    When The user navigates to "Frühstück" menu
    And  The user clicks "Milchprodukte" subCategory
    Then The user should see the Milchprodukte page
    When The user clicks "Essig und Sauce" subCategory
    Then The user should see the Essig und Sauce page
    When The user clicks "Oliven" subCategory
    Then The user should see the Oliven page
