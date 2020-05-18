Feature: Search For Cars For Sale
  As a customer
  I want ability to search for cars for sale
  so that i can purchase the car of my choice

  Scenario Outline: Customer can search for cars for sale
    Given I navigate to motors homepage
    When I enter "<Postcode>" of my house
    And I enter "<Make>" of the car
    And I select "<Model>" of the car
    And I select "<MinPrice>" of the car
    And I select "<MaxPrice>" of the car
    And I click on monthly cost
    And I click on search button
    Then new car page is displaye
    And I click on any result to view more detail


    Examples:
      |Postcode| Make   |MinPrice|MaxPrice|
      |M9 4wq  |Peugeot |£10,000 |£15000  |
@ignore
  Scenario Outline: Customer cannot search for cars for sale
    Given I navigate to motors homepage
    When I enter "<Postcode>" of my house
    And I enter "<Make>" of the car
    And I select "<Model>" of the car
    And I select "<MinPrice>" of the car
    And I select "<MaxPrice>" of the car
    And I click on monthly cost
    And I click on search button
    Then new car page is displaye
    And I click on any result to view more detail


    Examples:
      |Postcode| Make   |MinPrice|MaxPrice|
      |        |Nisan   |£10,000 |£15000  |
