Feature: Education-Preparation

  @SmokeTest
  Scenario: 12th Grade

    Given navigate to website
    And over hover the Education button
    When click 12.th Grade button
    And take 12.th Grade page title
    Then verify 12.th Grade text
    Then verify 12.th Grade page Url