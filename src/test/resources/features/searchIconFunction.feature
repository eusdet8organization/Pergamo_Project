@regression  @searchIcon @smoke
  Feature: Search Icon Function Tests

    Scenario: TC_0301-Positive Search Icon Function
      When The user writes "Getrocknete Feigen" in Search Box
      Then Verify that result appears


    Scenario: TC_0302-Negative Search Icon Function
      When The user writes "Schokolade Kuchen" in Search Box
      Then Verify that result appears


    Scenario: TC_0303-Negative Search Icon Function
      When The user writes " " in Search Box
      Then Verify that result appears not