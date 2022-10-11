package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver fb = new ChromeDriver();
		fb.manage().window().maximize();
		fb.get("https://www.facebook.com/");
		fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		fb.findElement(By.linkText("Create New Account")).click();
		fb.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		fb.findElement(By.xpath("//input[@name='lastname']")).sendKeys("leaf");
		fb.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testleaf@123.gmail.com");
		fb.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("testleaf@123");
		WebElement Date = fb.findElement(By.name("birthday_day"));
		Select op=new Select(Date);
		op.selectByVisibleText("22");
		
		WebElement Month = fb.findElement(By.name("birthday_month"));
		Select opt=new Select(Month);
		opt.selectByVisibleText("Sep");
		
		
		WebElement Year = fb.findElement(By.name("birthday_year"));
		Select option=new Select(Year);
		option.selectByVisibleText("2000");
		
		fb.findElement(By.xpath("//label[text()='Male']")).click();
		
	}

}
