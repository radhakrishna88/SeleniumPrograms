package seleni;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Button_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown_button = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown_button);
		select.selectByIndex(2);
		WebElement dropdown_button2 = driver.findElement(By.name("dropdown2"));
		Select select_2 = new Select(dropdown_button2);
		select_2.selectByVisibleText("Selenium");
		WebElement dropdown_3 = driver.findElement(By.id("dropdown3"));
		Select select_3 = new Select(dropdown_3);
		select_3.selectByValue("3");
		WebElement dropdown_4 = driver.findElement(By.className("dropdown"));
		Select select_4 = new Select(dropdown_4);
		List<WebElement> li = select_4.getOptions();
		
		System.out.println("Number of dropdown present is : "+li.size());
		WebElement using_send_key = driver.findElement(By.xpath("//div[@class='example'][5]/select"));
		using_send_key.sendKeys("Selenium");
		using_send_key.click();
		
		WebElement button_5 = driver.findElement(By.xpath("//*[@class='example'][6]/select"));
		Select select_5 = new Select(button_5);
		for(int i=1;i<=4;i++) {
			String of_i = Integer.toString(i);
		select_5.selectByValue(of_i);
		}
	}
}
