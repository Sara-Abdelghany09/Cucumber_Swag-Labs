Feature: Test login functionality

  Scenario: Test login with valid email and valid password
    Given Navigate to login page
    When  The User Enter Username "standard_user"
    And   The user Enter password "secret_sauce"
    And   Click on Login Button
    Then  The user is Logged in Successfully