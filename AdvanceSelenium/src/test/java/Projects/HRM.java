package Projects;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class HRM {
	public static void main(String[] args) throws IOException, SQLException {
		FileInputStream fie=new FileInputStream("./TSD/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fie);
		Sheet sh=wb.getSheet("org");
		Row row=sh.getRow(1);
		String orgName = row.getCell(2).toString();
		Random random=new Random();
		int ranInt = random.nextInt(1000);
		
		//Read the common data from Property file
		FileInputStream fis= new FileInputStream("./CommanData/hrmp.properties");
				Properties p=new Properties();
				p.load(fis);
		String BROWSER=p.getProperty("browser");
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		//switching browser
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("inputPassword")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name=\"projectName\"]")).sendKeys("nuro"+random);
		driver.findElement(By.xpath("//input[@name=\"createdBy\"]")).sendKeys("dimple");
		WebElement e=driver.findElement(By.xpath("(//select[@name=\"status\"])[2]"));
		Select s=new Select(e);
		s.selectByVisibleText("Completed");
 		driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();
 		
 		//verify the project in db
 		boolean flag=false;
 		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		Statement st = conn.createStatement();
		//to read the data
		ResultSet rset = st.executeQuery("select * from project");
		rset.next();
		
		while(rset.next()) {
			System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4)+"\t"+rset.getString(5)+"\t"+rset.getInt(6));
		}
	

		
		
		
		
	}

}
