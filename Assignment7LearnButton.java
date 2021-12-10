package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7LearnButton {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		//Learn Button
		
		//Initialize Chrome browser
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Find position of button (x,y)
		driver1.get("http://leafground.com/pages/Button.html");
		driver1.findElement(By.id("home")).click();	
		driver1.navigate().back();
		
		Point Location = driver1.findElement(By.id("position")).getLocation();
		System.out.println("X and Y co-ordinates are :"+Location);
		
		//Find button color
		 String cssValue = driver1.findElement(By.id("color")).getCssValue("background-color");
		 System.out.println("Color of the button is :"+cssValue);
		
		//Find button size
		Dimension size = driver1.findElement(By.id("size")).getSize();
		System.out.println("Height and Width of the object is :"+size);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver1.close();	
		
			
		

}}
