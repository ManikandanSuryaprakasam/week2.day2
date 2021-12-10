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

public class Assignment7LearnCheckBox {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		//Initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Load the url
		driver.get("http://leafground.com/pages/checkbox.html");

		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
			
		//Select the checkbox
		
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		driver.findElement(By.xpath("//div[text()='C']/input")).click();
		
		
		//Verify the checkbox is checked
		boolean selected = driver.findElement(By.xpath("//div[text()='C']/input")).isSelected();
		if (selected)
		{
			System.out.println("Selenium Checkbox is selected");
		}
		else
		{
			System.out.println("Selenium Checkbox is not selected");
		}
		
		
		//Deselect only selected
		if(driver.findElement(By.xpath("//div[text()='Not Selected']/input")).isSelected())
			driver.findElement(By.xpath("//div[text()='Not Selected']/input")).click();
		if(driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
			driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
		
		
		//Select All
		driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
		
		//driver.close();	
		
			

}}
