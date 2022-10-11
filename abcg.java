 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class abcg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd");
		PreparedStatement ps=con.prepareStatement("insert into emp values (?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("enter emp id");
			int eid=Integer.parseInt(br.readLine());
			System.out.println("enter emp name");
			String ename=br.readLine();
			System.out.println("enter emp sal");
			Double esal=Double.parseDouble(br.readLine());
			
			ps.setInt(1,eid);
			ps.setString(2,ename);
			ps.setDouble(3,esal);
			
			int count=ps.executeUpdate();
			
			if(count>0) {
				System.out.println(count+"data inserted");
			}else {
				System.out.println("no data inserted");
			}
			System.out.println("do u want to insert more data [yes/np]");
			String ch=br.readLine();
			if (ch.equalsIgnoreCase("no"))
				break;
		}
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}