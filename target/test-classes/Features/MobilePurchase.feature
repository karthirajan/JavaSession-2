#Author: Karthi@your.domain.com
@mobile
Feature: Mobile

Background:
    Given user launches flipkart application
    And user login by entering crendentials


@hardcode
 Scenario: Mobile purchase
    When user search mobile
    And user click on the mobile name
    Then user click on add to cart

@one @dim
  Scenario: Mobile purchase by using one dim list
    When user search mobile by one dim list
      | Apple | realme | one plus |
    And user click on the mobile name
    Then user click on add to cart

 
