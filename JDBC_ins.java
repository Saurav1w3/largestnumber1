package jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_ins {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Emp Id");
				int eid=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Emp name");
				String ename=br.readLine();
				
				System.out.println("Enter Emp sal");
				Double esal=Double.parseDouble(br.readLine());
				
				
				ps.setInt(1, eid);
				ps.setString(2, ename);
				ps.setDouble(3, esal);
				
				int count=ps.executeUpdate();
				
				if(count>0) {
					System.out.println(count+"Data inserted ");
				}
				else {
					System.out.println("no data inserted ");
				}
				System.out.println("Do you want to insert more data [yes/no]");
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"))
					break;
			}
		
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}


