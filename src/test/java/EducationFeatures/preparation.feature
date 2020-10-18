Feature: Education-Preparation

  @SmokeTest
  Scenario: Preparation Test

    Given navigate to website
    And over hover the Education button
    When click Preparation button
    Then verify Preparation text
    Then verify Url
