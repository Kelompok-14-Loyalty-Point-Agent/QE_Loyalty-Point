@TransactionHistory
Feature: Transaction History
  As a user
  I want to see transaction history
  So that i can see the transaction history

Scenario Outline: As a user i want to see the history in transaction history
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button transaction history tab 
    Then I click button history

Scenario Outline: As a user i want to see the on process in transaction history
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button transaction history tab 
    Then I click button on process