Feature: logon to website

  @Sanity @Regression
  Scenario: Check the website is working
    Given customer enters url in Browser
    When enters user name and password
    Then user is in home page
    ATATT3xFfGF08Wog_GWYgpmrf0ILndOF4AGFNIJM_2TlDry_33P6VWNXdAkl5TUmpGq7IF43p-ISQQJBXBUqqWT4ShNrSdXy0aH4g-zBJBVn5i9k-7GfnMQfFhsGotBtCWmGEGAL8n6gq179d_kjVy7xpcnn9f3Aya5WqMvclvRWtj279CnucQM=24B6D195


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
