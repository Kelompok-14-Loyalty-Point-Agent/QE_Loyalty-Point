@signin
Feature: Sign In Feature

  Scenario: as a user i have be able to success sign in (positif)
    Given I Open browser loyalty point
    When Open website loyalty pointt
    And I Enter a validd email and password
    Then I click sign in button and succes

  Scenario: as a user i have be able to invalid sign in empty fields password (negatif)
    Given I Open browser loyalty point
    When Open website loyalty pointt
    And I Enter a validd email and empty fields password
    Then I click sign in button and user sees a required error message in the password field

  Scenario: as a user i have be able to invalid sign in empty fields email (negatif)
    Given I Open browser loyalty point
    When Open website loyalty pointt
    And I Enter a empty fields email and valid password
    Then I click sign in button and user sees a required error message in the email field

  Scenario: as a user i have be able to invalid sign in empty fields email and password (negatif)
    Given I Open browser loyalty point
    When Open website loyalty pointt
    And I Enter a empty fields email and password
    Then I click sign in button and user sees a required error message in the email and password field

  Scenario: as a user i have be able to success sign in (negatif)
    Given I Open browser loyalty point
    When Open website loyalty pointt
    And I Enter a invalidd email and password
    Then I click sign in button and failed sign in