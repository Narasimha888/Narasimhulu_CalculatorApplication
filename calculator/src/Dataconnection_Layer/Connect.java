package Dataconnection_Layer;
import java.sql.*;
public class Connect {
public void dbmsConnect(int a,int b,String ss,int re) {
	try {
	
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","password");
		PreparedStatement p=con.prepareStatement("insert into operation values(?,?,?,?) ");
		p.setInt(1,a);
		p.setInt(2,b);
		p.setInt(4,re);
		p.setString(3, ss);
		p.executeUpdate();
		p.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
}
}
//"oracle.jdbc.driver.OracleDriver"