Feature: Search with n number of products

  Scenario Outline: 
    Given click the login link
    When provide <username> and <password> in the textbox
    And click the login button
    Then verify the status

    Examples: 
      | username | password   |
      | Admin    | admin123   |
      | User1    | AAAAAA     |
      | User2    | XCZVHG     |
      | User3    | ywuw378e   |
      | User4    | yy3w7hheRY |
