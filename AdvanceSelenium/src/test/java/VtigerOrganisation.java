import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class VtigerOrganisation {
	@Test
	public void method1(XmlTest test) {
		//FileInputStream fis= new FileInputStream("./CommanData/commondata.properties");
		//Properties p=new Properties();
		//p.load(fis);
		//Read the common data from Property file
//		String BROWSER=p.getProperty("browser");
//		String URL=p.getProperty("url");
//		String USERNAME=p.getProperty("username");
//		String PASSWORD=p.getProperty("password");
		//Read the common data from commandline
//		String BROWSER=System.getProperty("browser");
//		String URL=System.getProperty("url");
//		String USERNAME=System.getProperty("usn");
//		String PASSWORD=System.getProperty("psw");
//		System.out.println("browser"+BROWSER);
//		System.out.println("url"+URL);
//		System.out.println("username"+USERNAME);
//		System.out.println("password"+PASSWORD);
//		JSONParser parser=new JSONParser();
//		Object obj = parser.parse(new FileReader("./CommanData/DataCommon.json"));
//		JSONObject map=(JSONObject)obj;
//		String BROWSER=map.get("browser").toString();
//		String URL=map.get("url").toString();
//		String USERNAME=map.get("username").toString();
//		String PASSWORD=map.get("password").toString();
//		String time = map.get("timeout").toString();
//		int num = Integer.parseInt(time);
		//Read data from testng.xml
//		String BROWSER=test.getParameter("browser");
//		String URL=test.getParameter("url");
//		String USERNAME=test.getParameter("username");
//		String PASSWORD=test.getParameter("password");
//		System.out.println(BROWSER);
//		System.out.println(URL);
//		System.out.println(USERNAME);
//		System.out.println(PASSWORD);
		
		
		
		
		 
		//Read the Test_script_data from excel 
//		FileInputStream fie=new FileInputStream("./TSD/TestScript.xlsx");
//		Workbook wb = WorkbookFactory.create(fie);
//		Sheet sh=wb.getSheet("org");
//		Row row=sh.getRow(1);
//		String orgName = row.getCell(2).toString();
//		Random random=new Random();
//		int ranInt = random.nextInt(1000);
//		
//		
//		WebDriver driver=null;
//		switch(BROWSER) {
//		case "chrome":
//			driver=new ChromeDriver();
//			System.out.println("chrome is intiated");
//			break;
//		case "firefox":
//			driver=new FirefoxDriver();
//			System.out.println("firefox got intiate");
//			break;
//		case "edge":
//			driver=new EdgeDriver();
//			System.out.println("edge got inttiated");
//			break;
//			default:
//				driver=new ChromeDriver();
//				System.out.println("default got intiated");
//				break;
//				}
//		driver.get(URL);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(USERNAME); 
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PASSWORD); 
//		driver.findElement(By.id("submitButton")).click(); 
//		
//		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName+ranInt);
//		driver.findElement(By.xpath("(//input[@onclick=\"toggleAssignType(this.value)\"])[1]")).click();
//		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();
//		driver.findElement(By.id("dtlview_Organization Name")).getText();
//		WebElement logout = driver.findElement(By.xpath("(//img[@style=\"padding: 0px;padding-left:5px\"])[1]"));
//		Actions a=new Actions(driver);
//		a.moveToElement(logout).perform();
//		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
//		driver.quit();
//		
//		
		
		
	}

}
