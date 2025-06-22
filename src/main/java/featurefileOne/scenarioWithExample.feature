
@tag
Feature: Searching for different context in google
  

  @tag2
  Scenario Outline: Launch the Google page and search different types of contexts
    Given Open the browser and launch the URL
    When I search for "<searchTerm>"
    Then Check the title as "<searchTerm>"

    Examples:
      | searchTerm |
      | Java       |
      | Selenium   |    
