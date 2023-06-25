@transactiontest
Feature: Transaction

  Scenario: POST - Post add new transaction
    Given I set POST api endpoints Transaction
    When I send POST HTTP request Transaction
    Then I receive valid HTTP response code 201 Transaction

    Scenario: POST - Post add new transaction By Id
      Given I set POST api endpoints Transaction_ById
      When I send POST HTTP request Transaction_ById
      Then I receive valid HTTP response code 201 Transaction

    Scenario: GET - Get All User Id ( Transaction history )
      Given I set GET api endpoints All user id_history
      When I send GET HTTP request All user id_history
      Then I receive valid HTTP response code 200 transaction

      Scenario:

