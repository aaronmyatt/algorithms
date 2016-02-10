Feature: maxit

  Scenario: empty list
    Given I have an empty list
    When I run execute the MaxIt function
    Then I will see an empty list
