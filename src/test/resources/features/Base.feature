# new feature
# Tags: optional
Feature: User is able to navigates modules
@wip
  Scenario Outline: User navigates to "<module>"
    Given the user logged in
    When  the user navigate to "<module>" page
    Examples:
      | module      |
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Events      |
      | Maintenance |
      | Expenses    |
      | Lunch       |
      | Dashboards  |