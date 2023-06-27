@GetReward
Feature: GetReward
  As a user
  I want to redeem the reward
  So that i can success redeem the reward

  Scenario Outline: As a user i want to redeem phone balance reward
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart phone balance
    And I input phone number
    And I click button reedem your point
    Then I click done

@GetReward
  Scenario Outline: As a user i want to redeem phone balance reward but not input phone number
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart phone balance
    And I input empty phone number
    And I click button reedem your point
    Then I get result the error message in reedem

@GetReward
    Scenario Outline: As a user i want to redeem phone balance reward but point tidak cukup
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart phone balance
    And I input phone number
    And I click button reedem your point
    Then I get result poin tidak cukup message

@GetReward
  Scenario Outline: As a user i want to redeem internet kuota reward
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart internet kuota
    And I input phone number
    And I click button reedem your point
    Then I click done

@GetReward
  Scenario Outline: As a user i want to redeem internet kuota reward but not input phone number
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart internet kuota
    And I input empty phone number
    And I click button reedem your point
    Then I get result the error message in reedem

@GetReward
    Scenario Outline: As a user i want to redeem internet kuota reward but point tidak cukup
    Given I am on the landing page
    When I click button skip
    And I click button sign in
    And I input correct email in login 
    And I input correct password in login
    And I click button login
    And I click button get reward
    And I choose cart internet kuota
    And I input phone number
    And I click button reedem your point
    Then I get result poin tidak cukup message

