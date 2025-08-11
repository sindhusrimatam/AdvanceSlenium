package DataDrivenTesting;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WriteData {
	@Test
	public  void sample() throws Throwable {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.onlinesbi.sbi/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> links=driver.findElements(By.xpath("//a"));//get all the links of the page
		 System.out.println(links.size());
			for(WebElement eachLink:links) {
			@SuppressWarnings("deprecation")
			String link = eachLink.getAttribute("href");
			try{
				URL url = new URL(link);
				 HttpURLConnection conn=(HttpURLConnection)url.openConnection();
				 int statusCode=conn.getResponseCode();
				 if(statusCode>=400) {
					 System.out.println(link+"==="+statusCode);
				 }

			}
			catch(Exception e) {
			 
		 }
		 }
		 driver.quit();
		
	}

}
