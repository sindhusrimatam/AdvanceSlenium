package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus {
	@Test
	public void dateHandlingd() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[.='Date of Journey']")).click();
		 driver.findElement(By.xpath("//span[.='31']")).click();
		 driver.quit();
		 
		
	}

}
