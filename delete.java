 package jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
			Statement sm=con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true){
				System.out.println("enter emp id");
				int eid=Integer.parseInt(br.readLine());			
				int count=sm.executeUpdate("delete from emp where eno="+eid);
				
				if(count>0) {
					System.out.println(count+"data deleted");
				}else {
					System.out.println("no data deleted");
				}
				System.out.println("do u want to insert more data [yes/no]");
				String ch=br.readLine();
				if (ch.equalsIgnoreCase("no"))
					break;
			}	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}