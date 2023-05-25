Feature: logon to website

  @Sanity @Regression
  Scenario: Check the website is working
    Given customer enters url in Browser
    When enters user name and password
    Then user is in home page
    
  @Regression
    Scenario: veryfy user number
      Given user has got logged into accounts
      When clicks on chage number
      Then number has changed

  @Functional
   Scenario: logout form website
    Given user is in checkout page
     When clicks on logout button
     Then completely logout message should appear
