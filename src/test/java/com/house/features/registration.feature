Feature: customer wants to register

  @Regression
  Scenario Outline: with valid credentials

    Given I am home page
    When I enter <username> and <password>
    Then I would have logged on


    Examples:
    |username|password|
    |rk      | KRis   |

    @Functional
    Scenario Outline: with Ivalid credentials

      Given I am on home page
      When I enter <Inavlidname> and <passord1>
      Then I would have registered
      Examples:
      |Inavlidname|passord1|
      |ndfdf      |kris    |