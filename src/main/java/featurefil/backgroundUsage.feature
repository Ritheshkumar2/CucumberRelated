
@tag
Feature: User Login

Background: Login Page is common
 Given login into the application 

  @tag2
  Scenario Outline: launch the app with different credentials
     
    When User enter the "<username>" and "<password>"
    Then Get the "pageTitle"

    Examples: 
      | username  |   password | 
      | name1     |   Password1 | 
      | name2     |   Password2 |
      | name3     |   Password3 | 
