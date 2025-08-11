package DataDrivenTesting;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcConnection {
	public static void main(String[] args) throws SQLException {
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		Statement st = conn.createStatement();
		//to read the data
		//ResultSet rset = st.executeQuery("select * from project");
		//rset.next();
		
//		while(rset.next()) {
//			System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4)+"\t"+rset.getString(5)+"\t"+rset.getInt(6));
//		}
		
		//to insert data in to db
		int i = st.executeUpdate("insert into project values('TY_PROJ_2222','SINDHUSRI','07/10/2025','NURODOME','ONGOING','200')");
		System.out.println(i);
		conn.close();
		
	}

}
