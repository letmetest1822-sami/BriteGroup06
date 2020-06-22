@work
Feature: User should be able to view and manage employee records

  Background:
    Given the user is logged in with proper credentials

  Scenario: Page title should be displayed accordingly

    Then page should have the title "Employees"
