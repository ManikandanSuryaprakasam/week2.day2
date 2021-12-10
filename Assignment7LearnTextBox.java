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

public class Assignment7LearnTextBox {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		//Initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Load the url
		driver.get("http://leafground.com/pages/Edit.html");

		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
			
		//getText() and IsEnabled()
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Additionaltext");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String GetheText = driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input[@name='username']")).getText();
		System.out.println("Text in the Edit box is: "+GetheText);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input[@name='username']")).clear();
		
		if(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input[@type='text']")).isEnabled())
		{
		System.out.println("Edit field is enabled");
		}
		else
		{
			System.out.println("Edit field is disabled");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();	
		
			

}}
