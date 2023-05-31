Feature: Logout
  As a user
  I want to logout my account
  So that i can logout


  Scenario Outline: As a user i want to logout form my account
    Given I am on the product list
    And I click button sign in
    And I input field email "<email>" in login
    And I input field password "<password>" in login
    And I click button login
    And I click button sign out
    Then I get the "<result>"