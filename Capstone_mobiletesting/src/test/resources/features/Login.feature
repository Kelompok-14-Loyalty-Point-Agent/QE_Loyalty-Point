@Login
Feature: Login
  As a user
  I want to login
  So that i can access homepage


  Scenario Outline: As a user i want to login with valid data
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    Then I click button login

   Scenario Outline: As a user i want to login with wrong password data

     Given I am on the landing page
     When I click button skip
     And I click button sign in
     And I input correct email in login 
     And I input incorrect password in login
     And I click button login
     Then I get result password salah message

  Scenario Outline: As a user i want to login with wrong email data

     Given I am on the landing page
     When I click button skip
     And I click button sign in
     And I input incorrect email in login 
     And I input correct password in login
     And I click button login
     Then I get result the error message

  Scenario Outline: As a user i want to login with invalid email

     Given I am on the landing page
     When I click button skip
     And I click button sign in
     And I input invalid email in login 
     And I input correct password in login
     And I click button login
     Then I get result the invalid message

  Scenario Outline: As a user i want to login without input email

     Given I am on the landing page
     When I click button skip
     And I click button sign in
     And I input empty email in login 
     And I input correct password in login
     And I click button login
     Then I get result the invalid message

  Scenario Outline: As a user i want to login without input password

     Given I am on the landing page
     When I click button skip
     And I click button sign in
     And I input correct email in login 
     And I input empty password in login
     And I click button login
     Then I get result the invalid message

@ForgotPassword
  Scenario Outline: As a user i want to login with valid data but forgot

    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I click button forgot password
    And I input correct email in forgot
    And I click button send
    And I input verify code
    And I click button verify
    And I input new password
    And I input confirm new password
    And I click button save
    Then I click button go to sign in
    

    Scenario Outline: As a user i want to login with invalid email data but forgot

    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I click button forgot password
    And I input incorrect email in forgot
    And I click button send
    And I input verify code
    And I click button verify
    And I input new password
    And I input confirm new password
    And I click button save
    Then I click button go to sign in   