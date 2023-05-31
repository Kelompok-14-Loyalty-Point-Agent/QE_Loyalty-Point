Feature: Login
  As a user
  I want to login
  So that i can access homepage


  Scenario Outline: Login
    Given I am on the product list
    When I click button sign in
    And I input field email 
    And I input field password 
    And I click button login
    Then I get the message