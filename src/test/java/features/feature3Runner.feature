Feature: Tesltra Belong Coding Challenge Scenario3
  
 
  Scenario:  Select a dress and then add them item to cart, Validate whether same product name, colour and quantity are displayed in Cart Summary page.
  
    Given User is on Home page
     When megamenu Dresses>Summer Dresses clicked
      And Select a dress by adding in cart
     Then User should see the same product added with name, colour, and quantity in cart page
  
  
