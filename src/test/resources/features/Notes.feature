@notes
Feature: "Notes" Page functions

Background:
    Given the user should be logged in
    When the user navigates to "Notes"
    Then the page should have the "Notes" title

@createNote
 Scenario: Create A Note
      Given the user should clicks on "Create" button
      When the user writes "Any Thing" to Note Pannel
      And the user clicks on "Save" button
      Then the user should view "Edit" button

 @importNote
 Scenario: Import A Note (File)
    Given the user clicks on "Import" button
    When the user choose a file to upload
    And the user clicks on "Load File" button
