Feature: As a user, I should be able to create, edit and delete from Contacts List
  Description: The purpose of this feature is to test the Contacts functionality
  @wip
  Scenario: User should be able to click on Contacts button
    Given the user is logged in with proper credentials
    When the user clicks on "Contacts"
    Then page should have the title "Contacts"