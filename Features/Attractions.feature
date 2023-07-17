Feature: Attractions
@Attractions
Scenario Outline: Attractions
Given Navigate to URL "https://www.booking.com/"
Then Click on empty space
  Then Click on Attractions option
Then Type in "Rome" into search field by placeholder "Where are you going?"
  Then Click on Select your dates field
  Then Click on start date
  Then Click on end date
  Then Click on Search button by class
  #Then Browser quit

Examples:
|rr  |
|11  |