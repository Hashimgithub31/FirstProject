package org.selenium.first;

import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass{
	
    public static void main(String[] args) throws Exception {
    	
    	browserLaunch("https://adactinhotelapp.com/");
    	
    	maximise();
    	
    	WebElement userName = locators("name", "username");
    	
    	enterText(userName, "SuguAravind");
    	
    	WebElement password = locators("name", "password");
    	
    	enterText(password, "sugu@3005");
    
    	WebElement login = locators("name", "login");
    	
    	buttonClick(login);
    	
    	WebElement location = locators("name", "location");
    	
    	selectingValue(location, "Paris");
    	
    	WebElement hotels = locators("name", "hotels");
    	
    	selectingText(hotels, "Hotel Sunshine");
    	
    	WebElement roomType = locators("name", "room_type");
    	
    	selectingIndex(roomType, 4);
    	
    	WebElement roomNos = locators("name", "room_nos");
    	
    	selectingIndex(roomNos, 1);
    	
    	WebElement checkIn = locators("name", "datepick_in");
    	
    	buttonClick(checkIn);
    	
    	selectAll();
    	
    	enterText(checkIn, "09/10/2021");
    	
    	WebElement checkOut = locators("name", "datepick_out");
    	
    	buttonClick(checkOut);
    	
    	selectAll();
    	
    	enterText(checkOut, "11/10/2021");
    	
    	WebElement adults = locators("name", "adult_room");
    	
    	selectingValue(adults, "2");
    	
    	WebElement child = locators("name", "child_room");
    	
    	selectingValue(child, "0");
    	
    	sleep(3000);
    	
    	WebElement searchButton = locators("id", "Submit");
    	
    	buttonClick(searchButton);
    	
    	WebElement radio = locators("xpath", "(//input[@id='radiobutton_0'])[1]");
    	
    	buttonClick(radio);
    	
    	sleep(3000);
    	
    	WebElement continueBtn = locators("name", "continue");
    	
    	buttonClick(continueBtn);
    	
    	WebElement firstName = locators("name", "first_name");
    	
    	enterText(firstName, "Shin");
    	
    	WebElement lastName = locators("name", "last_name");
    	
    	enterText(lastName, "Chan");
    	
    	WebElement address = locators("name", "address");
    	
    	enterText(address, "Miami, Florida");
    	
    	WebElement ccNum = locators("name", "cc_num");
    	
    	enterText(ccNum, "1256458521563214");
    	
    	WebElement ccType = locators("name", "cc_type");
    	
    	selectingValue(ccType, "VISA");
    	
    	WebElement ccExpiry = locators("name", "cc_exp_month");
    	
    	selectingValue(ccExpiry, "3");
    	
    	WebElement ccExpiryYear = locators("name", "cc_exp_year");
    	
    	selectingText(ccExpiryYear, "2022");
    	
    	WebElement cvv = locators("name", "cc_cvv");
    	
    	enterText(cvv, "143");
    	
    	sleep(3000);
    	
    	WebElement book = locators("name", "book_now");
    	
    	buttonClick(book);
    
    }

 }
