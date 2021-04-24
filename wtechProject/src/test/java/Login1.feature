Feature: Login Test
  Scenario: Go to website and login
    Given Go to Hepsiburada website
    And Click login menu
    And Type email
    And Type password
    When Click login button
    Then  Check the cart
    Given Go to the Mainpage
    And Select random menu
    And Select random category
    And Select random brand
    And Type Value Between 10 and 4000
    And Select Product
    And Add product and Go to Basket
    And Increase Product
    And Complete the Shopping
    And Add New Address

