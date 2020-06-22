@work
Feature: User should be able to view and manage employee records

  Scenario: User should be able to click on Employees button
    Given the user is logged in with proper credentials
    When the user clicks on "Employees"
    Then page should have the title "Employees"