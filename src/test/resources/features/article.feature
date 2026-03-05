Feature: Article Management

  Scenario Outline: Create Article
    Given user logs into application
    When user creates article "<title>"

    Examples:
      | title               |
      | Selenium Article 1  |
      | Selenium Article 2  |


  Scenario: Update Article
    Given user logs into application
    When user updates article
      | title                    |
      | Updated Selenium Article |


  Scenario: Delete Article
    Given user logs into application
    When user deletes article
      | title                    |
      | Updated Selenium Article |