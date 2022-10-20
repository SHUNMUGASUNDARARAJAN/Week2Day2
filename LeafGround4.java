package week2day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	    
	    driver.findElement(By.xpath("//div/a[text()='Go to Dashboard']")).click();
	    String title =driver.getTitle();
	    System.out.println("Tittle is "+title);
	    driver.navigate().back();
	    
	    WebElement url = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
	    System.out.println("The URL is " +url.getAttribute("href"));
	    driver.findElement(By.xpath("//a[text()='Broken?']")).click();
	    String title1=driver.getTitle();
	    if(title1.contains("404")) {
	    	System.out.println("page is broken");
	    }
	    else {System.out.println("page is not broken");
	    }
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[3]")).click();
	    driver.navigate().back();
	    
	   WebElement count= driver.findElement(By.xpath("//h5[text()='Count Links']"));
	   Dimension linkcount=count.getSize();
	   count.click();
	   System.out.println("no.of.links "+linkcount);
	   
	   WebElement num=driver.findElement(By.xpath("//h5[text()='Count Layout Links']"));
	   Dimension layoutcount=num.getSize();
	   num.click();
	   System.out.println("no.of.layoutlinks "+layoutcount);
	   
	    
	    
	    
	    
	    
	}

	}
