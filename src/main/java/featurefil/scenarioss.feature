
@tag
Feature: Launch the google page

  @tag1
  Scenario: search for something on the google
    Given I open the browser
    When I go to "https://www.google.com"
    Then I should see the title contains "Google"
    And driver has to be closed

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
