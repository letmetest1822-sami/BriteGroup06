@events
Feature: Events Page Functionality
  Description:The purpose of this feature is to test the Events Page functionality


  Background: :
    Given the user should be able to login with valid credentials "expensesmanager85@info.com" "expensesmanager"
    Given the user navigates to "Events"


  Scenario Outline: Events summary should be able to match the event details
    When the user click on any event from the table <try>
    Then the information should match with the table
    Examples:
      | try |
      | 1   |
      | 2   |
      | 3   |