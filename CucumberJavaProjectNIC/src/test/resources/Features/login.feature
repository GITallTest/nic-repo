Feature: To login user with valid credentials

  Scenario: user should be able to login with valid username and password
    Given user is on home page
    And user login screen
    When user enters username and password
    Then user is redirecting on dashboard
