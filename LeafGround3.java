package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/checkbox.xhtml");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		    driver.findElement(By.xpath("//span[text()='Basic']")).click();
		    driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		    driver.findElement(By.xpath("//label[text()='Java']")).click();
		    driver.findElement(By.xpath("//label[text()='Python']")).click();
		    driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		    driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		    WebElement checkbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		    System.out.println("check box is disabled "+checkbox.isDisplayed());
		    driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		    driver.findElement(By.xpath("//li/label[text()='London']")).click();
		    driver.findElement(By.xpath("//li/label[text()='Paris']")).click();
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
