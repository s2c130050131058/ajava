import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.ServletConfig;

public class SendRedirect extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	//String title= "Send Redirect Example";
	String uname = req.getParameter("uname");
	String pass = req.getParameter("pass");
	
	
	//out.println("<html><head><title>"+title+"</title></head><body>");
	//out.println("<h1>"+title+"</h1>");
if(pass.equals("Archy"))
	{
		res.sendRedirect("SendRedirectWelcome");
	}
	else
	{
		res.sendRedirect("SendRedirect.html");
	}

	//out.println("</body></html>");
	
	
	}
}