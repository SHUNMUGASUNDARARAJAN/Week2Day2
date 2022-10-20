package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		    
		    
		    driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("TestLeaf");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).clear();
		    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys("India");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).clear();
		    driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).sendKeys("this class is most valueable");
		    Thread.sleep(3000);
		    
		    WebElement mail = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']"));
		    mail.sendKeys("testleaf123@gmail.com");
		    mail.sendKeys(Keys.TAB);
		    Thread.sleep(3000);
		    //type about yourself
            driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("Testleaf software solutuions");
            
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//span[@aria-controls='ql-picker-options-0'])[1]")).click();
            driver.findElement(By.xpath("(//span/span[@data-value='serif'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
            
            
            driver.findElement(By.xpath("(//span[@class='ql-size ql-picker'])[1]")).click();
            driver.findElement(By.xpath("(//span[@data-value='huge'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
            
            driver.findElement(By.xpath("(//button[@class='ql-italic'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
         
           
            driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
           
            driver.findElement(By.xpath("(//button[@class='ql-underline'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
            
            driver.findElement(By.xpath("(//button[@class='ql-strike'])[1]")).click();
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//div[@data-gramm='false'])[1]")).clear();
           
           //Just Press Enter and confirm error message
            WebElement errormsg = driver.findElement(By.xpath("//div/input[@name='j_idt106:thisform:age']"));
            errormsg.sendKeys(Keys.ENTER);
            WebElement errorcheck= driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
            if(errorcheck.isDisplayed()) {
            	System.out.println("age is mandatory");
            }
            Thread.sleep(3000);	
           
            //Type your name and choose the third option
            driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).sendKeys("leaf");
            driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
            driver.findElement(By.xpath("//li[@data-item-label='2']")).click();
            Thread.sleep(3000);
            //Type your DOB (month/day/year) and confirm date chosen
            WebElement dob = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
            dob.sendKeys("22/09/2022");
            dob.sendKeys(Keys.TAB);
            Thread.sleep(3000);
            
            //Type number and spin to confirm value changed
            WebElement num = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
            num.sendKeys("5");
            WebElement increment = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
            increment.click();
            WebElement decrement = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']"));
           decrement.click();
           Thread.sleep(3000);
            //Type random number (1-100) and confirm slider moves correctly
            driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("5");
            WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
            slider.getAttribute("55");
            Thread.sleep(3000);
            //Click and Confirm Keyboard appears
            driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
            WebElement keyBoard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
            System.out.println("keyboard is displayed " +keyBoard.isDisplayed());Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@class='keypad-special keypad-close ui-corner-all ui-state-default ui-state-highlight']")).click();
            Thread.sleep(3000);
            //Custom Toolbar
          
            driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
  
            driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
            driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
            driver.findElement(By.xpath("(//button[@class='ql-strike'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
            Thread.sleep(3000);
            driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
            driver.findElement(By.xpath("(//span/span[@data-value='serif'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
            driver.findElement(By.xpath("(//span[@class='ql-size ql-picker'])[2]")).click();
            driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("testleaf");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).clear();
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
		    
			
	}

}
