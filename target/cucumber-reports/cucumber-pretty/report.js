$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("airportTaxis.feature");
formatter.feature({
  "line": 2,
  "name": "Search AirportTaxis",
  "description": "As a user \nI want to search whether acomodations are available \nInorder to see the list",
  "id": "search-airporttaxis",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6819930900,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User navigates to the applications",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on Default of Booking URL \"https://www.booking.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Airport Taxis",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.booking.com",
      "offset": 32
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_am_on_Default_of_Booking_URL(String)"
});
formatter.result({
  "duration": 6787900800,
  "status": "passed"
});
formatter.match({
  "location": "SearchAirportTaxisStepDefinitions.i_should_see_Airport_Taxis()"
});
formatter.result({
  "duration": 160194600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search list of Airport Taxis",
  "description": "",
  "id": "search-airporttaxis;search-list-of-airport-taxis",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on airport taxis link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on oneway radio button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter pickUpLocation as \"Dubai International Airport\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter dropOffLocation as \"Hotel Fairmont The Palm\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select date as \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select pickUp hour as \"09\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select pickUp minute as \"30\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select passengers as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Search in Airport Taxis Page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see List of airport taxis available for given locations",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAirportTaxisStepDefinitions.i_click_on_airport_taxis_link()"
});
formatter.result({
  "duration": 4872666800,
  "status": "passed"
});
formatter.match({
  "location": "SearchAirportTaxisStepDefinitions.i_click_on_oneway_radio_button()"
});
formatter.result({
  "duration": 2238332200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai International Airport",
      "offset": 27
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_enter_pickUpLocation_as(String)"
});
formatter.result({
  "duration": 6609864100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Fairmont The Palm",
      "offset": 28
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_enter_dropOffLocation_as(String)"
});
formatter.result({
  "duration": 8376484100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_select_date_as(String)"
});
formatter.result({
  "duration": 1042271100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "09",
      "offset": 25
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_select_pickUp_hour_as(String)"
});
formatter.result({
  "duration": 391908800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 27
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_select_pickUp_minute_as(String)"
});
formatter.result({
  "duration": 344256200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "SearchAirportTaxisStepDefinitions.i_select_passengers_as(String)"
});
formatter.result({
  "duration": 153071500,
  "status": "passed"
});
formatter.match({
  "location": "SearchAirportTaxisStepDefinitions.i_click_on_Search_in_Airport_Taxis_Page()"
});
formatter.result({
  "duration": 2732150500,
  "status": "passed"
});
formatter.match({
  "location": "SearchAirportTaxisStepDefinitions.I_should_see_List_of_airport_taxis_available_for_given_locations()"
});
formatter.result({
  "duration": 2761377000,
  "status": "passed"
});
formatter.after({
  "duration": 1438617600,
  "status": "passed"
});
formatter.uri("carRentals.feature");
formatter.feature({
  "line": 2,
  "name": "Search Car Rentals",
  "description": "As a user \nI want to search whether acomodations are available \nInorder to see the list",
  "id": "search-car-rentals",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6635645300,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User navigates to the applications",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on Main of Booking URL \"https://www.booking.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Car Rentals",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.booking.com",
      "offset": 29
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_am_on_main_of_Booking_URL(String)"
});
formatter.result({
  "duration": 4440418200,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarRentalsStepDefinitions.i_should_see_Car_Rentals()"
});
formatter.result({
  "duration": 150550000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search list of Car Rentals",
  "description": "",
  "id": "search-car-rentals;search-list-of-car-rentals",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@scenario3"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on car rentals link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on return to same location radio button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter pick up from as \"Dubai Airport T3\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select date from as \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select check in time as \"10\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select check in time minutes as \"15\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select check out time as \"15\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select check out time minutes as \"30\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select date To as \"4\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on search in car rentals page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see List of car rentals available for given locations with rating as \"Excellent\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarRentalsStepDefinitions.i_click_on_car_rentals_link()"
});
formatter.result({
  "duration": 4538514600,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarRentalsStepDefinitions.i_click_on_return_to_same_location_radio_button()"
});
formatter.result({
  "duration": 3073941900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai Airport T3",
      "offset": 25
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_enter_pick_up_from_as(String)"
});
formatter.result({
  "duration": 5357015600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_date_from_as(String)"
});
formatter.result({
  "duration": 1655037600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 27
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_check_in_time_as(String)"
});
formatter.result({
  "duration": 2155541900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 35
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_check_in_time_minutes_as(String)"
});
formatter.result({
  "duration": 282207800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 28
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_check_out_time_as(String)"
});
formatter.result({
  "duration": 218454500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 36
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_check_out_time_minutes_as(String)"
});
formatter.result({
  "duration": 217588000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 21
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.i_select_date_To_as(String)"
});
formatter.result({
  "duration": 16298369100,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarRentalsStepDefinitions.i_click_on_search_in_car_rentals_page()"
});
formatter.result({
  "duration": 6934171600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Excellent",
      "offset": 79
    }
  ],
  "location": "SearchCarRentalsStepDefinitions.I_should_see_List_of_car_rentals_available_for_given_locations_with_rating_as(String)"
});
formatter.result({
  "duration": 3436420500,
  "status": "passed"
});
formatter.after({
  "duration": 797126000,
  "status": "passed"
});
formatter.uri("stays.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Search Accomodations",
  "description": "As a user \nI want to search whether acomodations are available \nInorder to see the list",
  "id": "search-accomodations",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7515435200,
  "status": "passed"
});
formatter.background({
  "line": 25,
  "name": "User navigates to the applications",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 26,
  "name": "I am on HomePage of Booking URL \"https://www.booking.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I should see Home Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.booking.com",
      "offset": 33
    }
  ],
  "location": "SearchAccomodationsStepDefinitions.i_am_on_HomePage_of_Booking_URL(String)"
});
formatter.result({
  "duration": 4379280900,
  "status": "passed"
});
formatter.match({
  "location": "SearchAccomodationsStepDefinitions.i_should_see_HomePage()"
});
formatter.result({
  "duration": 82663900,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Search list of Accomodations",
  "description": "",
  "id": "search-accomodations;search-list-of-accomodations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I click on Accomodations link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I enter Place as \"Dubai\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select from Date as \"0\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select to Date as \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on Search",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should see List is accomations available for given locations",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAccomodationsStepDefinitions.i_click_on_Accomodations_link()"
});
formatter.result({
  "duration": 131706800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai",
      "offset": 18
    }
  ],
  "location": "SearchAccomodationsStepDefinitions.i_enter_Place_as(String)"
});
formatter.result({
  "duration": 248641800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 23
    }
  ],
  "location": "SearchAccomodationsStepDefinitions.i_select_from_Date_as(String)"
});
formatter.result({
  "duration": 1372803300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "SearchAccomodationsStepDefinitions.i_select_to_Date_as(String)"
});
formatter.result({
  "duration": 597222300,
  "status": "passed"
});
formatter.match({
  "location": "SearchAccomodationsStepDefinitions.i_click_on_Search()"
});
formatter.result({
  "duration": 3858096800,
  "status": "passed"
});
formatter.match({
  "location": "SearchAccomodationsStepDefinitions.I_should_see_List_is_accomations_available_for_given_locations()"
});
formatter.result({
  "duration": 168880200,
  "status": "passed"
});
formatter.after({
  "duration": 879822900,
  "status": "passed"
});
});