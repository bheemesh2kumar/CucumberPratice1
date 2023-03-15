Feature: testing sign up Page

  Background:
    Given user is already on AccuWeather HomePage


  Scenario: Checks if the user gets weather report for one city

    And user provides city name as "Hyderabad"
    Then validate if user gets below values
      | RealFeelShade | 26       |
      | Air Quality   | Poor     |
      | Wind          | SW 8km/h |













