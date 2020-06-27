@leave
  Feature:User should be able to see leaves records
    Background:
      Given the user should be able to login
      Given the user should be able to be enter "Leaves"

      Scenario: User should be able to click on Leaves button
        Then page title should have the title "Leaves Summary"
        And the user should create a new request by clicking on Create button
        And the user should create with "caner" Description