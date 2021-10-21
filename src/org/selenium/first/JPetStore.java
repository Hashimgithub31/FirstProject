package org.selenium.first;

import org.openqa.selenium.WebElement;

public class JPetStore extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch("https://petstore.octoperf.com/actions/Catalog.action");
		
		maximise();
		
		WebElement signIn = locators("xpath", "//a[text()='Sign In']");
		
		buttonClick(signIn);
		
		WebElement register = locators("xpath", "//a[text()='Register Now!']");
		
		buttonClick(register);
		
		WebElement username = locators("name", "username");
		
		enterText(username, "ShinChan310395");
		
		WebElement password = locators("name", "password");
		
		enterText(password, "1234567890");
		
		WebElement repeatedPassword = locators("name", "repeatedPassword");
		
		enterText(repeatedPassword, "123456789");
		
		WebElement firstName = locators("name", "account.firstName");
		
		enterText(firstName, "Shin");
		
		WebElement lastName = locators("name", "account.lastName");
		
		enterText(lastName, "Chan");
		
		WebElement eMail = locators("name", "account.email");
		
		enterText(eMail, "shinchan879188@gmail.com");
		
		WebElement phoneNumber = locators("name", "account.phone");
		
		enterText(phoneNumber, "9876543210");
		
		WebElement address1 = locators("name", "account.address1");
		
		enterText(address1, "sector 6");
		
		WebElement address2 = locators("name", "account.address2");
		
		enterText(address2, "chandlier high");
		
		WebElement city = locators("name", "account.city");
		
		enterText(city, "wuhan");
		
		WebElement state = locators("name", "account.state");
		
		enterText(state, "China");
		
		WebElement zipCode = locators("name", "account.zip");
		
		enterText(zipCode, "21656");
		
		WebElement country = locators("name", "account.country");
		
		enterText(country, "China");
		
		WebElement language = locators("name", "account.languagePreference");
		
		selectingValue(language, "english");
		
		WebElement category = locators("name", "account.favouriteCategoryId");
		
		selectingValue(category, "DOGS");
		
		WebElement radio1 = locators("xpath", "((//input[@type='checkbox'])[1])[1]");
		
		buttonClick(radio1);
		
		WebElement radio2 = locators("xpath", "((//input[@type='checkbox'])[2])[1]");
		
		buttonClick(radio2);
		
		sleep(3000);
		
		WebElement newAccount = locators("name", "newAccount");
		
		buttonClick(newAccount);
		
		sleep(2000);
		
		WebElement signIn1 = locators("xpath", "//a[text()='Sign In']");
		
		buttonClick(signIn1);
		
		WebElement userName1 = locators("name", "username");
		
		buttonClick(userName1);
		
		selectAll();
		
		enterText(userName1, "ShinChan310395");
		
		WebElement password1 = locators("name", "password");
		
		buttonClick(password1);
		
		selectAll();
		
		enterText(password1, "1234567890");
		
		sleep(2000);
		
		WebElement signon = locators("name", "signon");
		
		buttonClick(signon);
		
		
	}

}
