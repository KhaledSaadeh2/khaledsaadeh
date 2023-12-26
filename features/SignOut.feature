Feature: Users Sign Out
  Description: The Users signed out of the System
  Actor: All Users

  Background: 
    Given the users credentials
      | khaledsholi@gmail.com    | khaled2001         | Admin     |
      | obada@gmail.com          | obada123           | Customer  |
      | ahmad@gmail.com          | ahmad2000          | Installer |

  Scenario Outline: the <role> signed out
    Given that the <role> is signed in
    When the <role> signs out
    Then the <role> is not signed in

    Examples: 
      | email                      | password            | role        |
      | "khaledsholi@gmail.com"    | "khaled2001"        | "Admin"     |
      | "obada@gmail.com"          | "obada123"         | "Customer"  |
      | "ahmad@gmail.com"          | "ahmad2000"         | "Installer" |
