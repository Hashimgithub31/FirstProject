package org.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class MouseOver {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriber.chrome.driver", "C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.homedepot.com/");
		
		Actions act = new Actions(driver);
		
		WebElement all = driver.findElement(By.xpath("//a[text()='All Departments']"));
		
		act.moveToElement(all).perform();
		
		Thread.sleep(2000);
		
		WebElement heat = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		
		act.moveToElement(heat).perform();
		
		Thread.sleep(2000);
		
		WebElement air = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		
		act.moveToElement(air).perform();
		
		Thread.sleep(2000);
		
		WebElement portable = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		
		portable.click();

}
}