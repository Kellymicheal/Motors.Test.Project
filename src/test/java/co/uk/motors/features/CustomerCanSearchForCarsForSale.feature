Feature: Search For Cars For Sale
  As a customer
  I want ability to search for cars for sale
  so that i can purchase the car of my choice

  Scenario Outline: Customer can search for cars for sale
    Given I navigate to motors homepage
    When I enter "<Postcode>" of my house
    And I enter "<Make>" of the car
    And I select "<Model>" of the car
    And I select "<MinPrice>" from the dropdown
    And I select "<MaxPrice>" from the dropdown
    And I click on search button
    Then new car page is displayed
    And I click on any result to view more detail


    Examples:
      |Postcode| Make  |Model|MinPrice|MaxPrice|
      |M9 4wq  |Toyota | C-HR|£10,000 |£15,000  |

  Scenario Outline: Customer cannot search for cars for sale
    Given I navigate to motors homepage
    When I enter "<Postcode>" of my house
    And I enter "<Make>" of the car
    And I select "<Model>" of the car
    And I select "<MinPrice>" of the car
    And I select "<MaxPrice>" of the car
    And I click on search button
    Then The search car page is remain

    Examples:
      |Postcode| Make   |Model|MinPrice|MaxPrice|
      |        |Nisan   |c-hr |£10,000 |£15000  |
