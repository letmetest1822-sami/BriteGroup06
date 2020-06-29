@notes
Feature: "Notes" Page functions


  Background:
    Given the user should be logged in
    When the user navigates to "Notes"
    Then the page should have the "Notes" title

    Scenario: Create A Note
      Given the user should clicks on "Create" button
      When the user writes "Any Thing" to Note Pannel
      And the user clicks on "Save" button
      Then the user views "Edit" button
