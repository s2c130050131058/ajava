import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class insertstatement extends HttpServlet{
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)throws 
  ServletException, IOException{  
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String url = 
   "jdbc:postgresql://localhost:5432/postgres";
  Connection conn;
  try{
  Class.forName("org.postgresql.Driver");
   Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/s2c130050131058", "postgres", "12345");
   Statement statement = con.createStatement();
  String query = "insert into student values(104,'Saloni','EC')";
  int i = statement.executeUpdate(query);
  if(i!=0){
  out.println("The record has been inserted");
  }
  else{
  out.println("Sorry! Fail to Insert");
  }
  statement.close();
  }
  catch (Exception e){
  System.out.println(e);
  }
  }
}