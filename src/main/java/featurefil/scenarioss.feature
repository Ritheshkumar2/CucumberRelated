
@tag12
Feature: Launch the google page

  @tag11
  Scenario: search for something on the google
    Given I open the browser
    When I go to "https://www.google.com"
    Then I should see the title contains "Google"
    And driver has to be closed

 
