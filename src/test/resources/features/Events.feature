
Feature: Events Page Functionality
  Description:The purpose of this feature is to test the Events Page functionality

  @events
  Scenario: User should be able to click on Events button
    Given the user is logged in with proper credentials
    When the user clicks on "Events"
    Then page should have the title "Events"



