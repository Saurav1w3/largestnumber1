 package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetch {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
		Statement sm=con.createStatement();
	ResultSet rs=sm.executeQuery("select * from emp");
	while(rs.next())
	{
	int eid=rs.getInt(1);
	String ename=rs.getString(2);
	Double esal=rs.getDouble(3);
	
	System.out.println("Emp Id:"+eid);
	System.out.println("Emp Name:"+ename);
	System.out.println("Emp Sal:"+esal);
	System.out.println("Next Data");
	
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}	
}
}
