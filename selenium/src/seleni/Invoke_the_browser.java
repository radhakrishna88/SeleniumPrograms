package seleni;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke_the_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement web = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		web.sendKeys("iphone 13");
		web.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		//driver.close();

	}

}
