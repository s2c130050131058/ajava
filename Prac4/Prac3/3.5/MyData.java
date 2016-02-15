import java.sql.*;
class MyData{
	public Connection SetConnection(String database){
		Connection con=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+database,"postgres","12345");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
	}
}