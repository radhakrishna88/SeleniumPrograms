package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Practice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/");
	WebElement textbox_page = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
	textbox_page.click();
	WebElement email_box = driver.findElement(By.id("email"));
	email_box.sendKeys("radha@gmail.com");
	WebElement append_text =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	append_text.sendKeys("appended");
	WebElement get_text_field =  driver.findElement(By.name("username"));
	String get_text = get_text_field.getAttribute("value");
	System.out.println("Fetched text from the box: "+get_text);
	WebElement clear_text_field =  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	clear_text_field.clear();
	WebElement disabled_box = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean is_disabled = disabled_box.isEnabled();
	if(is_disabled==false)
		System.out.println("The box is disabled.");
	else
		System.out.println("Not disabled");
	}
}
