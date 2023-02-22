Feature: testing sign up Page

  Background:
    Given user is already on Google search Page


  Scenario: check if google dropdown values present in automation
    And user enters "world top 10 cricketers" in google search box
    Then user checks below items is present in dropdown suggestions
      | world top 10 cricket league |
















