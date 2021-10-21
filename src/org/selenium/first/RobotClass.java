package org.selenium.first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriber.chrome.driver", "C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://en-gb.facebook.com/");
		
		Actions act = new Actions(driver);
		
		WebElement user = driver.findElement(By.id("email"));
		
		user.sendKeys("7200741445");
		
		Thread.sleep(1000);
		
		act.doubleClick(user).perform();
		
		Thread.sleep(1000);
		
		act.contextClick(user).perform();
		
		Thread.sleep(1000);
		
		Robot robo = new Robot();
		
		for (int i = 0; i < 2; i++) {
			
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.click();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		



	
}

}
