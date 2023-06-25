Feature: Sign Out
  As user
  I want to sign in then logout
  So that I can sign out

  @logout
  Scenario: As user, I have be able to sign out
    Given I am on the sign in page to test sign out
    When I input email to sign in
    And I input password to sign in
    And I click login to test sign out
    Then I click sign out button and I am back on the sign in page
