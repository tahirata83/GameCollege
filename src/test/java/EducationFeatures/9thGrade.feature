Feature: Education-Preparation

  @SmokeTest
  Scenario: 9th Grade

    Given navigate to website
    And over hover the Education button
    When click 9th Grade button
    And take 9th Grade page title
    Then verify 9th Grade text
    Then verify 9th Grade page Url