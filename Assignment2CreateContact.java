package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContact {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		
		
		//Initialize Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Create Contacts
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");;
		driver.findElement(By.id("lastNameField")).sendKeys("Suryaprakasam");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mani");;
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Surya");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This test is to automate the Create contact Page.So that we can validate the page at any time");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mani.suryaprakash@gmail.com");
	
		WebElement ddlState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(ddlState);
		select.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Edit and update
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
			
		driver.findElement(By.id("updateContactForm_firstName")).sendKeys("Edit FirstName");;
		driver.findElement(By.id("updateContactForm_lastName")).sendKeys("Edit Lastname");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Update']")).click();
		System.out.println("Title of the Page is:");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
