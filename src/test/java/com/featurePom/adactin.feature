Feature: Adactin Hotel Booking Application

Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enter The  Username In The InputBox       
And user Enter The  Password In The InputBox        
Then user Click On The LoginBtn And It Navigates To The SearchHotel

Scenario: Search Functionality
When user Select The Location From The Dropdown
And user Select The Hotels From The Dropdown
And user Select The RoomType From The Dropdown
And user Select The NoOfRooms From The Dropdown
And user Select The CheckIn Date In The InputBox
And user Select The CheckOut Date In The InputBox
And user Select The AdultsPerRoom From The Dropdown
And user Select The ChidrenPerRoom From The Dropdown
Then user Click On The SearchBtn And It Navigates To The SelectHotel

Scenario: Select Hotel Functionality
When user Select The Hotel Click On The RadioBtn
Then user Click On The ContinueBtn And It Navigates To The Book A Hotel

Scenario: Book A Hotel Functionality
When user Enter The FirstName In The InputBox
And user Enter The LastName In The InputBox
And user Enter The BillingAddress In The InputBox
And user Enter The CreditCard No In The InputBox
And user Select The CreditCardType From The Dropdown
And user Select The ExpiryDate In Month From The Dropdown
And user Select The ExpiryDate In Year From The Dropdown
And user Enter The CVVNumber In The InputBox
And user Click On The BookNowBtn
Then user Wait Five Sec And it Navigates To The Booking Confirmation

Scenario: Booking Confirmation Functionality
When user Click On The MyItineraryBtn And It Navigate To The Booked Itinerary

Scenario: Booked Itinerary Functionality
When user Click On The LogOutBtn And It Comes To The HomePage
 