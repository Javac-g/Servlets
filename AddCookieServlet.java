import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AddCookieServlet extends HttpServlet{
    
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        String data = request.getParameter("data");
        Cookie cookie = new Cookie("MyCookie",data);
        response.addCookie(cookie);
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<B>MyCookie has been set to");
        pw.println(data);
        pw.close();
        
        
    }
    
    
    
}