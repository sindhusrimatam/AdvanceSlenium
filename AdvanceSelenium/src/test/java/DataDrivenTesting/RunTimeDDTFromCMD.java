package DataDrivenTesting;

import org.testng.annotations.Test;

public class RunTimeDDTFromCMD {
	@Test
	public void runTime() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("usn");
		String PASSWORD=System.getProperty("psw");
		
		System.out.println("browser"+BROWSER);
		System.out.println("url"+URL);
		System.out.println("username"+USERNAME);
		System.out.println("password"+PASSWORD);
		
	}

}
