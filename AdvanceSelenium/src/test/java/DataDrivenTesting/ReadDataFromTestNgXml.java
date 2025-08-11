package DataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNgXml {
	
	@Test
	public void sampleTest(XmlTest test) {
			System.out.println(test.getParameter("browser"));
		}
	


}
