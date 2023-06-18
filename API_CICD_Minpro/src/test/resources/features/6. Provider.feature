@providertest
Feature: Provider

  As a admin
  I want to create new providers
  So that I can make more providers

  Scenario: GET - Get list all providers
    Given I set GET api endpoints providers
    When I send GET HTTP request providers
    Then I receive valid HTTP response code 200 providers

  Scenario: GET - Get list all with wrong url
      Given I set GET api endpoints providers wrong
      When I send GET HTTP request providers wrong
      Then I receive valid HTTP response code 404 providers

  Scenario: GET - Get provider by ID
    Given I set GET api endpoints providers ID
    When I send GET HTTP request providers ID
    Then I receive valid HTTP response code 200 providers

  Scenario: GET - Get provider by invalid ID
    Given I set GET api endpoints provider invalid_id
    When I send GET HTTP request provider invalid_id
    Then I receive valid HTTP response code 404 providers