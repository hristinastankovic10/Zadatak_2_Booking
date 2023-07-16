Feature: SearchZlatibor
  @SearchZlatibor
    Scenario Outline: SearchZlatibor

    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Type in "Zlatibor" into search field by placeholder "Where are you going?"
    Then Wait
    Then Click on Button by class "d47738b911 e246f833f7 fe211c0731"
    Then Click on start date
    Then Click on end date
    Then Wait
    Then Click on Search button
    Then Assert search results by class
    Then Browser quit
    Examples:
      |ww  |
      |11  |



