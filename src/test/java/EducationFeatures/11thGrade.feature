Feature: Education-Preparation

  @SmokeTest
  Scenario: _11th Grade

    Given navigate to website
    And over hover the Education button
    When click _11_th Grade button
    And take _11_th Grade page title
    Then verify _11_th Grade text
    Then verify _11_th Grade page Url