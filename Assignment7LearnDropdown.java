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

public class Assignment7LearnDropdown {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();


		
		//Learn Dropdown
		
		//Initialize Chrome browser
		ChromeDriver driver4 = new ChromeDriver();
		
		driver4.get("http://leafground.com/pages/Dropdown.html");
		driver4.manage().window().maximize();
		driver4.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement dropdown1 = driver4.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);
		
		
		WebElement dropdown2 = driver4.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		
		WebElement dropdown3 = driver4.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("1");
		
		WebElement dropdown4 = driver4.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4 = new Select(dropdown4);
		int dropdowncount =select4.getOptions().size();
		System.out.println("Count of item:"+dropdowncount);
		
		WebElement dropdown5 = driver4.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		dropdown5.sendKeys(Keys.TAB);
		dropdown5.sendKeys(Keys.ARROW_DOWN);
		dropdown5.sendKeys(Keys.TAB);
		
		
		WebElement dropdown6 = driver4.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		Select select6 = new Select(dropdown6);
		select6.selectByVisibleText("Selenium");
	
		
		

}}
