package jdbc;
 

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	public class DKJSJJYS {

		public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
			Statement sm=con.createStatement();
			sm.executeUpdate("create table emp(eno number,ename varchar(20),esal number)");
			System.out.println("table created successfully");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);}
		}
		

	}

