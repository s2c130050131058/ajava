import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.ServletConfig;

public class SendRedirectWelcome extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	String title= "Welcome Page";
	
	out.println("<html><head><title>"+title+"</title></head><body>");
	out.println("<h1>"+title+"</h1>");
	
	out.println("</body></html>");
	
	
	}
}