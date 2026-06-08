@tag12
Feature: Google Search functionality

  Background:
    Given Open the browser and launch Google homepage

  Scenario Outline: Search for different terms and verify title contains term
    When Enter the "<searchTerm>" in the search field and submit
    Then The page title should contain "<searchTerm>"

    Examples:
      | searchTerm |
      | Java       |
      | Selenium   |
      | Python     |
