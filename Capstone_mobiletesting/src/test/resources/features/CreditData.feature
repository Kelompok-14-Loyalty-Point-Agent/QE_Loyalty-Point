@CreditData
Feature: CreditData
  As a user
  I want to buy data
  So that i can success buy credit data


Scenario Outline: As a user i want to Purchase Successful credit with input number
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button credit data
    And I input phone number
    And I click button credit
    And I click nominal in credit
    And I click buy
    And I click payment method
    And I choose BRI
    And I click pay now
    Then I click done

  Scenario Outline: As a user i want to Purchase Successful credit without input payment method
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button credit data
    And I input phone number
    And I click button credit
    And I click nominal in credit
    And I click buy
    And I click pay now
    Then I get result the error message in reedem

Scenario Outline: As a user i want to Purchase Successful Data with input number
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button credit data
    And I input phone number
    And I click button data
    And I click nominal in data
    And I click buy
    And I click payment method
    And I choose BRI
    And I click pay now
    Then I click done

Scenario Outline: As a user i want to Purchase Successful Data without input payment method
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button credit data
    And I input phone number
    And I click button data
    And I click nominal in data
    And I click buy
    And I click pay now
    Then I get result the error message in reedem

    
