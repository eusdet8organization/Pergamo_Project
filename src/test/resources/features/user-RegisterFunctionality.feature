@regression  @register @smoke @jenkins
  Feature: User-Register Functionality Tests

    Background:
      When The user clicks Einloggen button
      Then Verify that the Benutzerkonto Erstellen button appears
      And The user clicks Benutzerkonto Erstellen button


    Scenario: TC_0201-Going to the Registration Page
      Then Verify that the Konto Erstellen page is opened


      Scenario Outline: TC_0201-Negative Registration in Step 1
      And The user fills the Unternehmensprofil data "<Name Der Firma>" "<Strassenadresse>" "<Stadt>" "<Land>" "<Postleitzahl>"
      Then Verify that the warning message
      Examples:
        | Name Der Firma | Strassenadresse | Stadt    | Land             | Postleitzahl |
        |                | Rosa Strasse 24 | Nürnberg | Deutschland      |    90409     |
        |  Star Team     |                 | Nürnberg | Deutschland      |    90409     |
        |  Star Team     | Rosa Strasse 24 |          | Deutschland      |    90409     |
        |  Star Team     | Rosa Strasse 24 | Nürnberg | Wähle ein Land...|    90409     |
        |  Star Team     | Rosa Strasse 24 | Nürnberg | Deutschland      |              |


      Scenario: TC_0203-Negative Registration in Step 2
        When The user fills the Unternehmensprofil data "Star Team" "Rosa Strasse 24" "Nürnberg" "Deutschland" "90409"
        And The user clicks Steuerstatus
        And The user clicks NachsteButton
        Then Verify that the warning message appears


       Scenario Outline: TC_0204-Negative Registration in Step 3
        When The user fills the Unternehmensprofil data "Star Team" "Rosa Strasse 24" "Nürnberg" "Deutschland" "90409"
        And The user clicks Steuerstatus
        And The user checks the Stimme Button
        And The user clicks NachsteButton
        And The user fills the primary contact data "<Vorname>" "<Nachname>"
        Then Verify that error message
      Examples:
        | Vorname | Nachname |
        |         | Star     |
        | Betul   |          |


      Scenario: TC_0205-Confirm mail adresse in Step 3
        When The user fills the Unternehmensprofil data "Star Team" "Rosa Strasse 24" "Nürnberg" "Deutschland" "90409"
        And The user clicks Steuerstatus
        And The user checks the Stimme Button
        And The user clicks NachsteButton
        And The user fills the primary contact data "Betul" "Star"
        And The user enters Email
        And The user clicks benutzerkontoEBox
        Then Verify that Email warning message


        Scenario: TC_0206-Password Indicator in Step 3
         When The user fills the Unternehmensprofil data "Star Team" "Rosa Strasse 24" "Nürnberg" "Deutschland" "90409"
         And The user clicks Steuerstatus
         And The user checks the Stimme Button
         And The user clicks NachsteButton
         And The user fills the primary contact data "Betul" "Star"
         And The user enters Email ,ConfirmEmail
         And The user enters less than sex character "abc"
         Then Verify that indicatorWarningMessage appears


     Scenario: TC_0207-Success Registration
       When The user fills the Unternehmensprofil data "Star Team" "Rosa Strasse 24" "Nürnberg" "Deutschland" "90409"
       And The user clicks Steuerstatus
       And The user checks the Stimme Button
       And The user clicks NachsteButton
       And The user fills the primary contact data "Betul" "Star"
       And The user enters Email ,ConfirmEmail
       And The user enters Password ,ConfirmPassword "Betul123"
       Then Verify that success registration






