package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/select.xhtml");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		    driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).click();
		    driver.findElement(By.xpath("//select/option[text()='Selenium']")).click();
		    driver.findElement(By.xpath("//div/label[@id='j_idt87:country_label']")).click();
		    driver.findElement(By.xpath("//li[@data-label='India']")).click();
		    driver.findElement(By.xpath("//div[@class='ui-selectonemenu ui-widget ui-state-default ui-corner-all ui-state-hover']")).click();
		    driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		    driver.findElement(By.xpath("(//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s'])")).click();
		    driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@class='ui-autocomplete-token-icon ui-icon ui-icon-close']")).click();
		    
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div/label[@id='j_idt87:lang_label']")).click();
		    driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		    driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[4]")).click();
		    driver.findElement(By.xpath("//li[@data-label='ஒன்று']")).click();
		    
		    
		    
		    
		    
	}

}
