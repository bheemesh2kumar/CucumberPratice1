Feature: testing sign up Page

  Scenario: Checks user if enters FirstName and lastname in sign UP window
    Given user is already on FacebookLogin Page
    When facebook login  title page is "test"
    And user clicks on CreateNewAccountButton
    Then user checks if enters Firstname and LastName "Bheemesh" and "Manukonda"








