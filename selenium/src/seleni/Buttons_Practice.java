package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radha Krishnan\\Documents\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement get_position = driver.findElement(By.id("position"));
		Point xyposition = get_position.getLocation();
		int xposition = xyposition.getX();
		int yposition = xyposition.getY();
		System.out.println("X position is : "+xposition+" Y position is : "+yposition);
		WebElement button_colour = driver.findElement(By.id("position"));
		String colour =  button_colour.getCssValue("background-color");
		System.out.println("Button Colour : "+colour);
		WebElement button_heightwidth = driver.findElement(By.id("size"));
		Dimension button_dimension =  button_heightwidth.getSize();
		int bheight = button_dimension.getHeight();
		int bwidth = button_dimension.getWidth();
		System.out.println("Button height is : "+bheight+" Button width is : "+bwidth);
		WebElement go_home =  driver.findElement(By.id("home"));
		go_home.click();
	}
}
