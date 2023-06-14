@logouttest
Feature: Logout
  As a user
  I want to be able to log out from the system
  So that my session is terminated and my data remains secure

  Scenario: Successful logout
    Given I set POST api endpoints logout
    When I send POST HTTP request logout
    Then I receive valid HTTP response code 200 logout

  Scenario: Invalid session token
    Given I set POST api endpoints logout
    When I send POST HTTP request logout2
    Then I receive valid HTTP response code 401 logout

