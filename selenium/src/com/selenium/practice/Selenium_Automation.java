package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Automation {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("user@phptravels.com");
		
		//driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("demouser"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demouser");
		WebElement gather = driver.findElement(By.xpath("(//label[text()='Password'])[1]"));
		String name = gather.getAttribute("class");
		System.out.println(name);
	}
}