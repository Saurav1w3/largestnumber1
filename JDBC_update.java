package jdbc;
 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC_update {

	public static void main(String[] args) {
		
		String value;
		int eid;
		double esal;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
			
			Statement sn=con.createStatement();
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
		
				System.out.println("Enter Emp Id");
				value=br.readLine();
				eid=Integer.parseInt(value);
				
				System.out.println("Enter Emp new sal");
				value=br.readLine();
				esal=Double.parseDouble(value);
				
				int count=sn.executeUpdate("update emp set esal="+esal+"where eno="+eid);
				
				if(count>0) {
					System.out.println(count+"Data updated ");
				}
				else {
					System.out.println("no data updated");
				}
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
