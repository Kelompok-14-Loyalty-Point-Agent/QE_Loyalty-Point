Feature: Edit Profile and change password
  @Editprofile
  Scenario: As a user, I have successfully changed profile
    Given I am onn the sign in page
    When I iinput email
    And I iinput password
    And I click sign in button
    And I click button profile
    And I enter on nama lengkap
    And I enter on alamat
    Then I click save changes and success