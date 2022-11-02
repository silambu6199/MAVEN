$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/featureCucumber/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking Application",
  "description": "",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@test1"
    },
    {
      "line": 4,
      "value": "#Scenario Outline: Login Functionality"
    }
  ],
  "line": 5,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The  Username In The InputBox",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user Enter The  Password In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The LoginBtn And It Navigates To The SearchHotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 34501343700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_Username_In_The_InputBox()"
});
formatter.result({
  "duration": 428665600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_Password_In_The_InputBox()"
});
formatter.result({
  "duration": 206436800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Click_On_The_LoginBtn_And_It_Navigates_To_The_SearchHotel()"
});
formatter.result({
  "duration": 5352382700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#  \"\u003cusername\u003e\""
    },
    {
      "line": 12,
      "value": "#  \"\u003cpassword\u003e\""
    },
    {
      "line": 14,
      "value": "#Examples:"
    },
    {
      "line": 15,
      "value": "#   |username|password|"
    },
    {
      "line": 16,
      "value": "#   |silambu2210|12345678|"
    },
    {
      "line": 17,
      "value": "#   |kesavan2309|123456|"
    },
    {
      "line": 18,
      "value": "#   |santhosh10|098765|"
    },
    {
      "line": 19,
      "value": "#@test2"
    }
  ],
  "line": 20,
  "name": "Search Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user Select The Location From The Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user Select The Hotels From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The RoomType From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The NoOfRooms From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The CheckIn Date In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The CheckOut Date In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select The AdultsPerRoom From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select The ChidrenPerRoom From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Click On The SearchBtn And It Navigates To The SelectHotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Select_The_Location_From_The_Dropdown()"
});
formatter.result({
  "duration": 822680200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_Hotels_From_The_Dropdown()"
});
formatter.result({
  "duration": 230294700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_RoomType_From_The_Dropdown()"
});
formatter.result({
  "duration": 268670100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_NoOfRooms_From_The_Dropdown()"
});
formatter.result({
  "duration": 262763200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_CheckIn_Date_In_The_InputBox()"
});
formatter.result({
  "duration": 245287200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_CheckOut_Date_In_The_InputBox()"
});
formatter.result({
  "duration": 253503900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_AdultsPerRoom_From_The_Dropdown()"
});
formatter.result({
  "duration": 240169100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_ChidrenPerRoom_From_The_Dropdown()"
});
formatter.result({
  "duration": 267908600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Click_On_The_SearchBtn_And_It_Navigates_To_The_SelectHotel()"
});
formatter.result({
  "duration": 1003348400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 31,
      "value": "#@test3"
    }
  ],
  "line": 32,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user Select The Hotel Click On The RadioBtn",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Click On The ContinueBtn And It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Select_The_Hotel_Click_On_The_RadioBtn()"
});
formatter.result({
  "duration": 138044200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Click_On_The_ContinueBtn_And_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 1064243300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 36,
      "value": "#@test4"
    }
  ],
  "line": 37,
  "name": "Book A Hotel Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user Enter The FirstName In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "user Enter The LastName In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The BillingAddress In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter The CreditCard No In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The CreditCardType From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select The ExpiryDate In Month From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Select The ExpiryDate In Year From The Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Enter The CVVNumber In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click On The BookNowBtn",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Wait Five Sec And it Navigates To The Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Enter_The_FirstName_In_The_InputBox()"
});
formatter.result({
  "duration": 421206300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_LastName_In_The_InputBox()"
});
formatter.result({
  "duration": 565923800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_BillingAddress_In_The_InputBox()"
});
formatter.result({
  "duration": 877871100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_CreditCard_No_In_The_InputBox()"
});
formatter.result({
  "duration": 499733900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_CreditCardType_From_The_Dropdown()"
});
formatter.result({
  "duration": 2869796900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_ExpiryDate_In_Month_From_The_Dropdown()"
});
formatter.result({
  "duration": 359689200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Select_The_ExpiryDate_In_Year_From_The_Dropdown()"
});
formatter.result({
  "duration": 230039800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Enter_The_CVVNumber_In_The_InputBox()"
});
formatter.result({
  "duration": 221247100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Click_On_The_BookNowBtn()"
});
formatter.result({
  "duration": 126674700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_Wait_Five_Sec_And_it_Navigates_To_The_Booking_Confirmation()"
});
formatter.result({
  "duration": 5024153100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 49,
      "value": "#@test5"
    }
  ],
  "line": 50,
  "name": "Booking Confirmation Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;booking-confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "user Click On The MyItineraryBtn And It Navigate To The Booked Itinerary",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Click_On_The_MyItineraryBtn_And_It_Navigate_To_The_Booked_Itinerary()"
});
formatter.result({
  "duration": 4889835300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 53,
      "value": "#@test6"
    }
  ],
  "line": 54,
  "name": "Booked Itinerary Functionality",
  "description": "",
  "id": "adactin-hotel-booking-application;booked-itinerary-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 55,
  "name": "user Click On The LogOutBtn And It Comes To The HomePage",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Click_On_The_LogOutBtn_And_It_Comes_To_The_HomePage()"
});
formatter.result({
  "duration": 602660700,
  "status": "passed"
});
});