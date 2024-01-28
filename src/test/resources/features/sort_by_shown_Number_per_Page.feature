@regression @sortProducts
Feature: Sort by shown Number per Page Tests

  Scenario: TC_0901-Product Sorting(Backen&Kochen)
    When The user navigates to "Backen & Kochen" menu
    Then The user should see the BackenKochen page
    When The user changes the option in ARTIKEL PRO SEITE to 10
    Then The user should see a maximum of 10 articles on the page
    When The user changes the option in ARTIKEL PRO SEITE to 15
    Then The user should see a maximum of 15 articles on the page

  Scenario: TC_0902-Product Sorting(Nüsse&Kerne)
    When The user navigates to "Nüsse & Kerne" menu
    Then The user should see the NusseKerne page
    When The user changes the option in ARTIKEL PRO SEITE to 20
    Then The user should see a maximum of 20 articles on the page
    When The user changes the option in ARTIKEL PRO SEITE to 25
    Then The user should see a maximum of 25 articles on the page