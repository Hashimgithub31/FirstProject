package org.selenium.first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass  {
	
	static WebDriver driver;
	
	static Actions a;
	
	static Select s;
	
	static Robot robo;
	
	static Alert al;
	
	public static void browserLaunch(String url) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\driver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get(url);
	
	}
	
	public static void navigateTo(String url) {
		
		
		driver.navigate().to(url);
		
	}
	
	public static void navigateBack() {
		
		driver = new ChromeDriver();
		
		driver.navigate().back();
		
	}
	
	public static void maximise() {
		
		driver.manage().window().maximize();
		
	}

	
	static WebElement element;
	
	public static WebElement locators(String locators, String value) {
		
		
		
		if (locators.equals("id")) {
			
			return element = driver.findElement(By.id(value));
			
		}
		
		else if (locators.equals("name")) {
			
			return element = driver.findElement(By.name(value));
			
		}
		
		else if (locators.equals("xpath")) {
			 
			return element = driver.findElement(By.xpath(value));
		}
		
		else {
			
			return element = driver.findElement(By.tagName(value));
		}
	}
	
		
	
	public static void enterText( WebElement element, String text) {
		
		element.sendKeys(text);
		
	}
	
	public static void buttonClick(WebElement element) {
		
		element.click();
		
	}
	
	
	
	public static void dnd(WebElement source, WebElement destination) {
		
		a= new Actions(driver);
	
		a.dragAndDrop(source, destination).perform();
		
	}
	
	public static void doubleClicking(WebElement element) {
		
		a= new Actions(driver);
		
		a.doubleClick(element).perform();
		
	}
	
	public static void rightClick(WebElement element) {
		
		a= new Actions(driver);
		
		a.contextClick(element).perform();
		
	}
	
	public static void mouseOverAction(WebElement element) {
		
		a= new Actions(driver);
		
		a.moveToElement(element).perform();
		
	}
	
	public static void selectingValue(WebElement element, String value ) {
		
		s= new Select(element);
		
		s.selectByValue(value);
		
	}
	                   
	public static void selectingIndex(WebElement element, int index ) {
		
		s= new Select(element);
		
		s.selectByIndex(index);
		
}

	public static void selectingText(WebElement element, String value ) {
	
		s= new Select(element);
		
		s.selectByVisibleText(value);
	
}
	
	public static void screenShot(String Filename) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\screenshot\\ "+Filename+".png");
		
		FileUtils.copyFile(src, des);
		
		
		
	}
	
	public static void sleep(long value) throws Exception {
		
		Thread.sleep(value);
		
	}
	
	public static void acceptAlert() {
		
		 al = driver.switchTo().alert();
		
		al.accept();
		
	}
	
	public static void dismissAlert() {
	
		
		al.dismiss();
		
	}
	
	public static void selectAll() throws AWTException {
		
		robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_A);
	}
	
	public static void copy() {
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_C);
		
		
	}
	
	public static void cut() {
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_X);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_X);
		
	}
	
	public static void paste() {
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
	}
	
	public static void quit() {
		
		driver.quit();
		
	}
	
	
	
		
		
		
	
	
	

}

		
	