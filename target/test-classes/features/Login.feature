
@login
Feature:the user signed in and
  Scenario Outline: login as a user
    Given user on the login page
    When user enters "<email>" and "<password>"
    Then "<role>" on  "<page>"

    Examples:
      | email               | password | role        | page            |
      | student98@library   | A15Oposz | student98   | Book Management |
      | student99@library   | 8tIDMH5x | student99   | Book Management |
      | student100@library  | CUcGL8fe | student100  | Book Management |
      | librarian15@library | S5Ejblg1 | librarian15 | Dashboard       |

