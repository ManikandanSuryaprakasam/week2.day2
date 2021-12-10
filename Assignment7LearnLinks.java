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

public class Assignment7LearnLinks {

	public static void main(String[] args) {


		
		WebDriverManager.chromedriver().setup();


				
		//Learn Link
		
		//Initialize Chrome browser
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Go to Home Page
		driver2.get("http://leafground.com/pages/Link.html");
		driver2.findElement(By.linkText("Go to Home Page")).click();
		driver2.navigate().back();
		
		
           
		
		System.out.println(driver2.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		driver2.findElement(By.linkText("Verify am I broken?")).click();	
		String text = driver2.findElement(By.xpath("//h1[text()='HTTP Status 404 – Not Found']")).getText();
		if (text.equals("HTTP Status 404 – Not Found")) {

         System.out.println("It is an Error page");
	}
		else
		{
			System.out.println("Error page not displayed");
		}
		driver2.navigate().back();
		
		driver2.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver2.navigate().back();
		List<WebElement> Links  = driver2.findElements(By.tagName("a"));
		System.out.println("Total number of Links are :");
		System.out.print(Links.size());
		
		driver2.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver2.close();	
		
		
		

}}
