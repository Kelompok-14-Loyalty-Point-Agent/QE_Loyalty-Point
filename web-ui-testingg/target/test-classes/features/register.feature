#@register
#Feature: Register Feature
#
#  Scenario: As user i have be able to success crete account
#    Given I Open browserr
#    When Open website alta-shopp
#    When user input valid name
#    And user input valid email
#    And user input valid password
#    And user click register button
#    Then user success to create account and redirect to login
#
#  Scenario: As user i have be able to failed crete account invalid email
#    Given I Open browserr
#    When Open website alta-shopp
#    When user input valid name
#    And user input invalid email
#    And user input valid password
#    And user click register buttonn
#    Then user failed to create account
#
#  Scenario: As user i have be able to failed crete account invalid email and invalid password
#    Given I Open browserr
#    When Open website alta-shopp
#    When user input valid name
#    And user inputt invalid email
#    And user input invalid password empty fields
#    And user click registerr buttonn
#    Then user failed to create account