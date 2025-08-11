package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ksrtc {
	@Test
	public void date() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://ksrtc.in/");
		 WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		  JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,100);");
			 WebElement element = driver.findElement(By.xpath("//span[.='Select Departure City']"));
			 Thread.sleep(2000);
			 element.click();
			 driver.findElement(By.xpath("(//input[@placeholder=\"Search Your City Name\"])[1]")).sendKeys("bengaluru");
			 driver.findElement(By.xpath("//li[.='Bengaluru']")).click();
			 driver.findElement(By.xpath("//span[.='Select Destination City']")).click();
			 driver.findElement(By.xpath("((//input[@placeholder=\"Search Your City Name\"])[2]")).sendKeys("kadapa");
			 driver.findElement(By.xpath("//li[.='Kadapa']")).click();
			 driver.findElement(By.xpath("//span[.='August']/ancestor::div[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/table/descendant::a[.='14']")).click();
			  driver.quit();
			 
			 
	
		
	}

}
