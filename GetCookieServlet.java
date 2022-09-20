import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GetCookieServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>");
        for(int i =0; i < cookies.length;i++){
            String name = cookies[i].getName();
            String value = cookies[i].getValue();
            pw.println("name = " + name + " ; value = " + value);
        }
        pw.close();
    }
    
}