@regression @login @smoke
Feature: User-Login Functionality Tests

  Background:
    When The user navigates to Einloggen

  @positiveLogin
  Scenario: TC_0101-Positive Login with valid credentials
    And The user logs in with credentials "testfirma@gmail.com" and "testFirma"
    Then Verify that the user has logged in successfully

  @negativeLogin
  Scenario: TC_0102-Negative Logins
    And The user logs in with credentials "" and "testFirma"
    Then Verify warning Email "Please fill in this field." message
    And The user logs in with credentials "testFirma@gmail.com" and ""
    Then Verify warning Password "Please fill in this field." message
    And The user logs in with credentials "testFirma@gmail.com" and "12345678"
    Then Verify warning Email or Password "Die E-Mail-Adresse oder das Passwort ist falsch." message
