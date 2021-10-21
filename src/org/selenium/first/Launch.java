package org.selenium.first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriber.chrome.driver", "C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://www.flipkart.com");
		
		
		Actions act=new Actions(driver);
		
		WebElement xButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		xButton.click();
		
		WebElement home = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/128/128/image/ab7e2b022a4587dd.jpg?q=100']"));
		
		act.moveToElement(home).perform();
		
		WebElement bath = driver.findElement(By.xpath("//a[text()='Cleaning & Bath']"));
		
		act.moveToElement(bath).perform();
		
		WebElement taps = driver.findElement(By.xpath("//a[text()='Taps & Faucet']"));
		
		act.moveToElement(taps).perform();
		
		taps.click();
		
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\mrf\\eclipse-workspace\\SeleniumFirst\\screenshot\\facebook.png");
		
		FileUtils.copyFile(src, des);
		
		
	}
}
