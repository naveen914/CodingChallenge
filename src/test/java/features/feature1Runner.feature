Feature: scenario1  

 Scenario:  User should be able to register using a valid email address
  
  When User clicked on Signin button and enter correct email address "abcpotnuru23311@gmail.com"
    And Enter all following mandatory fields
	| cfirstname | clastname | password |  fName |  Lname  |          addr1           |   city   |  state   | postcode |    country    |   mobile   |  ref | 
	| Naveen     | Potnuru   | abc@123  | Naveen | Potnuru | 2, tarneit Road, Tarneit | Melbourne| Virginia |   20102  | United States | 0449150984 | test |
     And click on register button
    Then User should be able to register using a valid email address
  	  

  

  
