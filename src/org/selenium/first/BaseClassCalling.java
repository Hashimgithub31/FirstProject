package org.selenium.first;

import org.openqa.selenium.WebElement;

public class BaseClassCalling extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch("https://www.facebook.com/");
		
		sleep(3000);
		
		screenShot("fb");
		
		WebElement userName = locators("id", "email");
		
		enterText(userName, "mohamed");
		
		selectAll();
		
		rightClick(userName);
		
		sleep(2000);
		
		cut();
		
		
		WebElement password = locators("id", "pass");
		
		buttonClick(password);
    	
    	sleep(3000);
    	
    	paste();
    
	}

}
