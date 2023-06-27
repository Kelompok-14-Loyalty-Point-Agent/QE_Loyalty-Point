@FAQ
Feature: FAQ
  As a user
  I want to see FAQ
  So that i can see the FAQ list


Scenario Outline: As a user i want to see the FAQ list
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button profile tab
    And I click button FAQ
    And I click field FAQ1
    Then I click done 