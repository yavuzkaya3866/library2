Feature: Login


  Scenario Outline: login as authorized user
    When user login as a "<role>"
    Then user on "<page>"

    Examples:
      | role        | page      |
      | student11   | books     |
      | librarian13 | dashboard |


  Scenario:  user should able to logout
    Given user login as a "student"
    When the user should able to click "Log Out"
    Then user should able to "login" page


  Scenario Outline: access to modules
    Given user login as a "<userType>"
    Then user should able to access "<module>"

    Examples:
      | userType    | module                  |
      | student11   | Books, Borrowing Books  |
      | librarian13 | Dashboard, Users, Books |