package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();


		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Manikandan");

		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Suryaprakasam");

		// Step 9: Enter the mobile number
		//input[@type='text']/preceding-sibling:://div[text()='Mobile number or email address']
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input[@type='text']")).sendKeys("mani.suryaprakash@gmail.com");

		// Step 10: Enter the password
		driver.findElement(By.xpath(" //div[text()='New password']/following-sibling::input[@type='password']")).sendKeys("TwentyFive@125");

		// Step 11: Handle all the three drop downs
		WebElement ddlday = driver.findElement(By.id("day"));
		Select select1 = new Select(ddlday);
		select1.selectByValue("25");

		WebElement ddlmonth = driver.findElement(By.id("month"));
		Select select2 = new Select(ddlmonth);
		select2.selectByValue("11");

		WebElement ddlyear = driver.findElement(By.id("year"));
		Select select3 = new Select(ddlyear);
		select3.selectByValue("1981");

		// Step 12: Select the radio button "Female" 

		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@name='sex']")).click();

		// Step 13: Sign up" 

		driver.findElement(By.xpath("//button[text()='Sign Up'][@name='websubmit']")).click();


		driver.close();







	}

}
