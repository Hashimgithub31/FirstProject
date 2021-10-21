package org.selenium.first;

import org.openqa.selenium.WebElement;

public class BlazeDemo extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch("https://blazedemo.com/");
		
		maximise();
		
		WebElement origin = locators("name", "fromPort");
		
		selectingText(origin, "Paris");
		
		WebElement destination = locators("name", "toPort");
		
		selectingValue(destination, "New York");
		
		sleep(3000);
		
		WebElement findFlight = locators("xpath", "//input[@value='Find Flights']");
		
		buttonClick(findFlight);
		
		WebElement choose = locators("xpath", "(//input[@value='Choose This Flight'])[4]");
		
		buttonClick(choose);
		
		WebElement name = locators("name", "inputName");
		
		enterText(name, "ShinChan");
		
		WebElement address = locators("name", "address");
		
		enterText(address, "20,bridgeton road");
		
		WebElement city = locators("name", "city");
		
		enterText(city, "Paris");
		
		WebElement state = locators("name", "state");
		
		enterText(state, "France");
		
		WebElement zipCode = locators("name", "zipCode");
		
		enterText(zipCode, "35465");
		
		WebElement cardType = locators("name", "cardType");
		
		selectingValue(cardType, "visa");
		
		WebElement creditCardNumber = locators("name", "creditCardNumber");
		
		enterText(creditCardNumber, "1541254232149854");
		
		WebElement month = locators("name", "creditCardMonth");
    	
    	buttonClick(month);
    	
    	selectAll();
    	
    	enterText(month, "03");
    	
    	WebElement year = locators("name", "creditCardYear");
    	
    	buttonClick(year);
    	
    	selectAll();
    	
    	enterText(year, "2022");
    	
    	WebElement nameOnCard = locators("name", "nameOnCard");
		
		enterText(nameOnCard, "ShinChan");
    	
		WebElement radio = locators("xpath", "(//input[@type='checkbox'])[1]");
    	
		buttonClick(radio);
		
		sleep(3000);
		
		WebElement purchase = locators("xpath", "//input[@value='Purchase Flight']");
		
		buttonClick(purchase);
	}

}
