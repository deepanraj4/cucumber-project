Feature: To verify ParaBank website

  Scenario: User needs to open the parabank login page
    Given user need to enter the Username and Password
    Then user have to click the login button
    And user verify the login successful

  Scenario Outline: User attempting to pay bill in parabank website
    Given user clicking the bill pay option
    Then User needs to enter the <payee Name> and <Address>
    And user needs to enter the <city> and <state Name>

    Examples: 
      | payee Name | Address   | city    | state Name |
      | Deepanraj  | Velachery | Chennai | TamilaNadu |
