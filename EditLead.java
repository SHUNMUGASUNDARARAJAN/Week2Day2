package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']/following::input[28]")).sendKeys("google");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='11514']")).click();
		String title= driver.getTitle();
	    System.out.println(title );
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
	    driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("EditLead");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    System.out.println("Company Name Changed']");
	    
	    
		
	}

}
