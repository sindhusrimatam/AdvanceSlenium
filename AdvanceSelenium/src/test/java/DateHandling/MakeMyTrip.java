package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Test
	public void sample() {
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.makemytrip.com/");
		 driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		 driver.findElement(By.xpath("//span[@class=\"styles__Close-sc-1bytt3z-0 kezeYI\"]")).click();
		 driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]")).click();
		 driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("bengaluru");
		 driver.findElement(By.xpath("//span[@class=\"makeFlex flexOne spaceBetween appendRight10\"]/span[.='Bengaluru']")).click();
		 driver.findElement(By.xpath("//span[.='To']")).click();
		 driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("kadapa");
		 driver.findElement(By.xpath("//span[@class=\"makeFlex flexOne spaceBetween appendRight10\"]/span[.='Cuddapah']")).click();
		 String month="September 2025";
		 String date="6";
		 driver.findElement(By.xpath("//span[.='Departure']")).click();
		 for(;;){
			 try {
				 driver.findElement(By.xpath("//div[.='"+month+"']/../descendant::div[@class=\"DayPicker-Day\"]/p[.='"+date+"']")).click();
				 
			 }
			 catch(Exception e) {
				 driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
				   }
			 break;
			 }
		
		 driver.quit();
		 
		 
		 
		 
	}

}
