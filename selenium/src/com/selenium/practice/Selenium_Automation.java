package com.selenium.practice;

import java.lang.reflect.RecordComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.backgroundservice.model.RecordingStateChanged;
import org.openqa.selenium.grid.session.remote.ServicedSession;

public class Selenium_Automation {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestingplayground.com/dynamicid");
		WebElement button= driver.findElement
				(By.xpath("//*[@class='btn btn-primary'][contains(text(),'Button with Dynamic ID')]"));
		System.out.println(button.isDisplayed());
		button.click();
		
		System.out.println(button.isDisplayed());
		
	
	}
}