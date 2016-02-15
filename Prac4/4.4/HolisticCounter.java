import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
// Extend HttpServlet class
public class HolisticCounter extends HttpServlet {
 
 static int counter=0;
 int count=0;
 static Hashtable ht = new Hashtable();
	  
	  
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {  
      // Set response content type
      response.setContentType("text/html");
	  count++;
      PrintWriter out = response.getWriter();
      String title = "Total number of page access since loading.";
      ht.put(this,this);
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +
      "transitional//en\">\n";
      out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n" +
        "<body bgcolor=\"#f0f0f0\">\n" +
        "<h1 align=\"center\">" + title + "</h1>\n" +
        "<h2 align=\"center\">" + count + "</h2>\n" +
		   "<h2 align=\"center\">" +"currently"+ ht.size() +"instances."+ "</h2>\n" +
		   "<h2 align=\"center\">" +"Across all the instances"+ counter +"has been accessed times."+ "</h2>\n" +
        "</body></html>");
  }
}