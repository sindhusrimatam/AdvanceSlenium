package DateHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Irctc {
	@Test
	public void dateHandlingd()throws Throwable {
		
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(opts);
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		 driver.findElement(By.xpath("//span[@class=\"ng-tns-c59-10 ui-calendar\"]")).click();
		 String month="September";
		 String date="6";
		 for(;;){
			 try {
				 driver.findElement(By.xpath("//span[.='"+month+"']/../../../div[@class=\"ui-datepicker-calendar-container ng-tns-c59-10 ng-star-inserted\"]/descendant::td/a[.='"+date+"']")).click();
				 
			 }
			 catch(Exception e) {
				 driver.findElement(By.xpath("//span[@class=\"ui-datepicker-next-icon pi pi-chevron-right ng-tns-c59-10\"]")).click();
				   }
			 break;
			 }
		 driver.quit();

}
}
