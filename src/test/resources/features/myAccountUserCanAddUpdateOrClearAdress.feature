@regression @address

Feature: My Account-User can Add, Update or Clear adress

  Background:
    Given The user navigates to Einloggen
    When The user logs in with credentials "testfirma@gmail.com" and "testFirma"
    When The user clicks on account button
    And The user clicks on "Addresses" button
    Then Verify that the user is on the Address page

  Scenario Outline: TC_10_01_Update The Address
    When The user clicks on edit button
    And The user updates the fields "<Address 1>", "<Address 2>", "<City>",  "<Postal Code>"
    And The user clicks on update Address button
    Then Verify that the user is on the Address page
    Examples:
      | Address 1      | Address 2  | City   | Postal Code |
      | Happyhappy str | SweetHeart | Berlin | 45632       |


  Scenario Outline: TC_10_02_Add A New Address
    When The user clicks on add a new address button
    And The user updates the fields "<firstname>", "<lastname>", "<company>", "<Address 1>", "<Address 2>", "<City>",  "<Postal Code>"
    And The user clicks on add Address button
    Then Verify that the user is on the Address page
    Examples:
      | firstname | lastname | company  | Address 1    | Address 2 | City  | Postal Code |
      | Obiwan    | Kenobi   | Starwars | Tantonie str | Galaxy    | Space | 5555        |


  Scenario: TC_10_03_Clear a Added Address
    When The user clicks on remove button
    Then Verify that the user is on the Address page
