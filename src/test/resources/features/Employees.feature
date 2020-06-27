@emp
Feature: User should be able to view and manage employee records

  Background:
    Given the user is logged in with proper credentials


  Scenario: User should be able to click on Employees button
    Then page should have the title "Employees"

  Scenario Outline: User should be able to click on "<employee>" to see details.
    When user click on "<employee>" name
    Then the details of "<employee>" should be displayed
    Examples:
      | employee         |
      | Antoine Langlais |
      | Ashley Presley   |

