Feature: testing facebook Home page

  Scenario: checking facebook home page button admin
    Given user logs into facebook with "Admin" user
    Then user check if button is displayed


  Scenario: checking facebook home page button normal user
    Given user logs into facebook with "Normaluser" user
    Then user check if button is displayed


