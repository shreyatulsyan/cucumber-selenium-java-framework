@smoke
Feature: Enter values in Text Box

  Scenario Outline: Enter values in Text Box
    Given Open the Chrome and launch the application 2
    When Click on Elements
    And Click on TextBox
    And Enter "<fullname>"
    Then Click on Submit
    And Validate Name Shreya

    Examples:
      | fullname |
      | shreya   |

