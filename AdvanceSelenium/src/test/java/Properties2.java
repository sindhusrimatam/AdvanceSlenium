import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties2 {
	public static void main(String[] args) throws IOException {
FileInputStream fis= new FileInputStream("./CommanData/cmd2.properties");
		
		Properties p=new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String EMAIL = p.getProperty("email");
		String PASSWORD = p.getProperty("password");
		WebDriver driver=null;
		switch(BROWSER) {
		case "chrome":
			driver=new ChromeDriver();
			System.out.println("chrome is intiated");
			break;
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("firefox got intiate");
			break;
		case "edge":
			driver=new EdgeDriver();
			System.out.println("edge got inttiated");
			break;
			default:
				driver=new ChromeDriver();
				System.out.println("default got intiated");
				break;
				}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[contains(text(),'Toggle navigation')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
		
		
		
		
	}

}
