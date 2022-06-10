Feature: user should able to login to account

  Scenario: user loggedin to account
    Given Selecting city
    And  clicking on the Login to your account
    When user enters the vaild emailId and password
    Then user should be login successfully
