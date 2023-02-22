Feature: testing sign up Page

  Background:
    Given user is already on Facebook login page
    And facebook login page has facebook lable as "Facebook"

  Scenario: Checks the user if enters details signup page
    Then check if user is able to enter details on signup page


  Scenario: Check if DateofBirthNumbers are sorting order
    And check if user is able to enter details on signup page
    Then  check if dob details are sorted in order


  Scenario: enter values in registration page
    And user enters below registartion details
      | FirstName    | bheemesh   |
      | SurName      | manukonda  |
      | MobileNumber | 9533538818 |














