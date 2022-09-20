import java.io.*;
import java.util.*;
import jakarta.servlet.*;

public class PostParametersServlet extends GenericServlet{
	
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
		
		PrintWriter pw = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()){
			
			String pname = e.nextElement();
			pw.print(pname + " = ");
			String pvalue = request.getParameter(pname);
			pw.println(pvalue);
			
		}
		pw.close();
		
		
		
	}
	
	
	
}