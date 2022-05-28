package seleni;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_My_Show_Home {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.bookmyshow.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement personal_update=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Not Now']")));
		
		//WebElement personal_update=driver.findElement(By.xpath("//button[text()='Not Now']")); //locating with know text
		personal_update.click(); //.findElement(By.xpath("//button[@id='wzrk-cancel']")) //for cancel
		WebElement location =  driver.findElement(By.xpath("//*[@src='//in.bmscdn.com/m6/images/common-modules/regions/chen.png']"));
		location.click();
		WebElement search_bar =  driver.findElement(By.xpath("//*[@id='4']"));
		search_bar.click();
		WebElement search_movie  = driver.findElement(By.xpath("//input[@class='sc-jWojfa eTcNgn']"));
		search_movie.sendKeys("kathuvakula rendu kadhal");
		//WebDriverWait waiting=new WebDriverWait(driver, Duration.ofMillis(10000));
		
		//search_movie.sendKeys(Keys.ENTER);
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		WebElement movie_duration =  driver.findElement(By.xpath("//*[@class='sc-2k6tnd-1 eRBvwk'][2]"));
		String movie_length = movie_duration.getText().substring(0, 6);
		System.out.println("The movie length is "+movie_length);
	}

}
