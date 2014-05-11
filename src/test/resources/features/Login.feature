Feature: Login Page Authentication
    As a Customer
    I want to be able to Login
    So that i can make a bet

Scenario: Logging in with valid credentials
    Given I have a valid account
    And I am on the Login Page
    When I fill in my user details
    And I press "Sign in"
    Then I see "Signed in"
