#Author: thangakumaran@your.domain.com
@tv
Feature: Tv Purchase
  
  Scenario: Tv purchase
   Given user launces the flipkart appctn
    And user login by enter valid credentials
    When user search the Tv
    And user click on the Tv name
    Then user click on add tocart 
   
   @one 
     Scenario: Tv purchase by using one dim list
    Given user launces the flipkart appctn
    And user login by enter valid credentials
    When user searching the Tv by one dim list
         |SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV|Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV|SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV|
    And user click on the Tv name
    Then user click on add tocart 
    
     Scenario: Tv purchase by using one dim map
    Given user launces the flipkart appctn
    And user login by enter valid credentials
    When user searching the Tv by one dim map
         |1|SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV|
         |2|Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV|
         |3|SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV|
    And user click on the Tv name
    Then user click on add tocart 
 
    Scenario Outline: Tv purchase by outline
    Given user launces the flipkart appctn
    And user login by enter valid credentials
    When user search the Tv "<Tv Purchase>"
    And user click on the Tv name
    Then user click on add tocart 

    Examples: 
      | Tv Purchase  | 
      | SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV |
      | Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV  |
      | SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV |