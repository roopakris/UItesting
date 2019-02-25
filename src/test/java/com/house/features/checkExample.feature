Feature: checking balance on Gift card

Background: What is this Kolaveri
  Given Always at homepage
  Scenario Outline: As a Registered customer would like to check the balance

    Given I am on My account Page
    When I click on GiftCard and E voucher link
    Then I should be on Gift card balance Page
    When I enter <ValidGiftCard> and click ok
    Then I should see the balance on my card
    When I enter <InvalidGiftCard>
    Then I should see the error message

    Examples:
      |ValidGiftCard|InvalidGiftCard|
      |893434|90039|


