@Register
Feature: Register
  As a user
  I want to register account
  So that i can success register account


Scenario Outline: As a user i want to register account with valid data
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input correct email in register
    And I input correct password in register
    And I input correct confirm password in register
    Then I click create an account button

 Scenario Outline: As a user i want to register account without input fullname
    Given I am on the get point page
    When I click button create a new account 
    And I input empty fullname in register
    And I input correct email in register
    And I input correct password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account without input email
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input empty email in register
    And I input correct password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account without input password
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input correct email in register
    And I input empty password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account without input confirm password
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input correct email in register
    And I input correct password in register
    And I input empty confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account with invalid email data
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input invalid email in register
    And I input correct password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account with existing account
    Given I am on the get point page
    When I click button create a new account 
    And I input correct fullname in register
    And I input existing account email in register
    And I input correct password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account but fill the email with password and fill the password with email
    Given I am on the get point page
    When I click button create a new account 
    And I input fullname in register
    And I input email with password
    And I input password with email
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account but fill the email field with fullname
    Given I am on the get point page
    When I click button create a new account 
    And I input fullname in register
    And I input email with fullname
    And I input correct password in register
    And I input correct confirm password in register
    And I click create an account button
    Then I get result the error message in register

Scenario Outline: As a user i want to register account without fill any field
    Given I am on the get point page
    When I click button create a new account 
    And I input empty fullname in register
    And I input empty email in register
    And I input empty password in register
    And I input empty confirm password in register
    And I click create an account button
    Then I get result the error message in register