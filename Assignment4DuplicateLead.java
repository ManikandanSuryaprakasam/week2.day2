package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4DuplicateLead {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		//Initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();

		//Load the url
		driver.get("http://leaftaps.com/opentaps");

		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//Login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Delete Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("gmail");
		driver.findElement(By.linkText("Find Leads")).click();
		
		String FirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		if(driver.getTitle().equals("Duplicate Lead | opentaps CRM"))
		{
			System.out.println("Title verified!!!");
		}
		else
		{
			System.out.println("Title not matched");
		}
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
				
		
		String ViewName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (ViewName.equals(FirstLead))
		{
			System.out.println("Duplicate Lead Created");
		}
		else
		{
			System.out.println("Duplicate Lead not Created");
		}
			
		
		
	driver.close();	


	}

}
