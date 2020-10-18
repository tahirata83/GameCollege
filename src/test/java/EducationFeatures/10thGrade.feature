Feature: Education-Preparation

  @SmokeTest
  Scenario: _10th Grade

    Given navigate to website
    And over hover the Education button
    When click _10th Grade button
    And take _10th Grade page title
    Then verify _10th Grade text
    Then verify _10th Grade page Url