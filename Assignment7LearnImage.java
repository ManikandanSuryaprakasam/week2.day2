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

public class Assignment7LearnImage {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		
		//Learn Image 
		//Initialize Chrome browser
		ChromeDriver driver3 = new ChromeDriver();
			driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver3.get("http://leafground.com/pages/Image.html");
		driver3.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver3.navigate().back();
		
		//Find broken image
		Dimension size2 = driver3.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getSize();
		
		if((size2.height == 16) && (size2.width ==16))
		{
			System.out.println("This is a broken image");
		}
		else
		{
			System.out.println("This image is not a broken image");
		}
		
		//Use Keyboard event
		driver3.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver3.close();
		
			
		
		

}}
