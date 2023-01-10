Feature: This is to test the HotelBooking Process

  Scenario Outline:  Verify the HotelBooking Process with all valid details
    Given User should be in adactin Home Page
    When User should Enter the "<Username>" and "<Password>"
    And User should Click on the Login button
    And User should Select "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>""<AdultsperRoom>","<ChildrenperRoom>"
    And User should Click on the Search button
    And User should Select the Hotel from the list
    And User should Click on the Continue button
    And User should Enter the "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>","<CVVNumber>"
    And User should Click on the BookNow button
    
    Examples:
    |Username|Password|
    |Suganya17s|Suganya@17s|
   
    |Location|Hotels|RoomType|NumberofRooms|CheckInDate|CheckOutDate|AdultsperRoom|ChildrenperRoom|
    |New York|Hotel Sunshine|Super Deluxe|1|20/1/2023|25/1/2023|2|0 - None|
    Examples:
    |FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryMonth|ExpiryDate|CVV Number|
    |Vijay|agish|8 Angalamman kovil street,Pondicherry|4321876512345678|3|7|2025|555|