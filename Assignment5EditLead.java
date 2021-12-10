package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5EditLead {

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

		//Edit Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']")).sendKeys("Ram");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a[@class='linktext']")).click();

		


		if(driver.getTitle().equals("View Lead | opentaps CRM"))
		{
			System.out.println("Title verified!!!");
		}
		else
		{
			System.out.println(driver.getTitle());
		}

		String updateCompanyname = "Microsoft";
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateCompanyname);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String txtcompname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(txtcompname.contains(updateCompanyname))
		{
			System.out.println("Updated successfully");
		}
		else
		{
			System.out.println("not Updated");
		}



		driver.close();	


	}

}
