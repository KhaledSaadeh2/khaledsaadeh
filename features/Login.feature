Feature: Users Sign in
  Description: The Users signs into System
  Actor: All Users

  Background: 
    Given the users credentials
      | khaledsholi@gmail.com     | khaled2001         | Admin     |
      | obada@gmail.com           | obada1234          | Customer  |
      | ahmad@gmail.com           | ahmad2000          | Installer |

  Scenario Outline: the <role> enter valid credentials
    Given That the <role> is not signed in
    And the <role> email is <email>
    And the <role> password is <password>
    Then the <role> sign in succeeds
    And the <role> is signed in
    Then go to <role> page

    Examples: 
      | email                      | password            	| role        |
      | "khaledsholi@gmail.com"    | "khaled2001"	        | "Admin"     |
      | "obada@gmail.com"          | "obada1234"          	| "Customer"  |
      | "ahmad@gmail.com"          | "ahmad2000"         	| "Installer" |

  Scenario Outline: the <role> enter invalid credentials
    Given That the <role> is not signed in
    And the <role> email is <email>
    And the <role> password is <password>
    Then the <role> sign in not succeeds
    And the <role> is not signed in

    Examples: 
      | email                      | password            | role        |
      | "khaledsholi@gmail.com"    | "khaled2002"        | "Admin"     |
      | "obada@gmail.com"          | "obada123"          | "Customer"  |
      | "ahmad@gmail.com"          | "ahmad2002"         | "Installer" |
