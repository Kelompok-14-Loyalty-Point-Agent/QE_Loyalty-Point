@Logout
Feature: Logout
  As a user
  I want to logout my account
  So that i can logout

Scenario Outline: As a user i want to logout from my account
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button profile tab
    Then I click button log out