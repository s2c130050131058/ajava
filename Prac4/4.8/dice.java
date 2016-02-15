import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class dice extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		
	PrintWriter out = res.getWriter();
	int dice1, dice2,total;
	dice1= (int)(Math.random()*6)+1;
	dice2= (int)(Math.random()*6)+1;
	out.println("<html><body>");
	out.println("<h2>Dice roller</h2><br>");
	out.println("<font size=5>Value of dice 1 = " + dice1 + "<br>" +
	"Value of dice 2 = " +dice2+"<br>");
	total=dice1+dice2;
	out.println("total dice value is = "+total);
	out.println("</font></body></html>");
	}
}