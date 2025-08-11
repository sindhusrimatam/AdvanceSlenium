package DateHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Goibibo {
	@Test
	public void dateHandlingd()throws Throwable {
		
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(opts);
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=!SEM!DF!G!Brand!RSA&cmp=SEM|D|DF|G|Google-CPC-Brand|DF-Brand-EM|Goibibo-Flight|RSA%3e&gad_source=1&gad_campaignid=108599293&gbraid=0AAAAADrlxCeVHfCNjmsbwsqy46Y8WKwJY&gclid=CjwKCAjw4efDBhATEiwAaDBpbv8Ugdg8va5uZ4x9Q5P_bpAdx0TOFTP-3jJcdw4ZgabKG1TshEhEPhoCNCsQAvD_BwE");
		 driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
		 driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();
		 //from
		 driver.findElement(By.xpath("//span[.='From']/../p[.='Enter city or airport']")).click();
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Bengaluru");
		 
		 driver.findElement(By.xpath("//p[.='Bengaluru International Airport']")).click();
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kadapa");
		 
		 driver.findElement(By.xpath("//span[contains(.,'Cuddapah, India')]")).click();
		  //date
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
