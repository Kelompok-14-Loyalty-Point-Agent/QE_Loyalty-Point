@redeembenefittest
Feature: Redeem Benefit

  As a User
  I want to Redeem voucher
  So that I can get benefit


#Positif - GET
  Scenario: GET - Get Voucher
    Given I set GET api endpoints Voucher
    When I send GET HTTP request voucher
    Then I receive valid HTTP response code 200 voucher

    Scenario: GET - Get By Id Voucher
    Given I set GET api endpoints Voucher By Id
    When I send GET HTTP request Voucher By Id
    Then I receive valid HTTP response code 200 voucher



