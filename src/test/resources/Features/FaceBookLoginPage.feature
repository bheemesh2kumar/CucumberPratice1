Feature: testing facebook login page

  Background:
    Given user is already on FacebookLogin Page
    When facebook login  title page is "testingpage"


  Scenario: testing if user is able to see facebook Logo on LOginPage
    Then user checks Facebook logo on login Page


