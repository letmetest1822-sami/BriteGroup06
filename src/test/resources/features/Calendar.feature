

@calendar
Feature: the user should navigate to Calendar Page
  @this
  Scenario: the user should be able to see Calendar Page
    Given the user is logged in with proper credentials
    When the user should clicks on "Calendar"
    Then page should contain the title "Meetings"

    Scenario: the user should be checked his/her username in the attendees list checkbox ticked up as default

    
