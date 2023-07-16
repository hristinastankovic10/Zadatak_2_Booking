Feature: Flights
  @Flights
  Scenario Outline: Flights
    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Click on Flight option
    Then Click on destination input field
    Then Click on Airport or City field and input "Wien"
    Then Click on date field
    Then Click on Submit button
    Then Browser quit
    Examples:
      |ll  |
      |11  |