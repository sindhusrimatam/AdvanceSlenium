package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(new FileReader("./CommanData/DataCommon.json"));
		JSONObject map=(JSONObject)obj;
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeout"));
		
		
	}

}
