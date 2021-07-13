import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServletDemo extends HttpServlet{    
   public void doGet(HttpServletRequest req,HttpServletResponse res)    
      throws ServletException,IOException    
   {     
      PrintWriter pwriter=res.getWriter(); res.setContentType("text/html");
      Enumeration en=req.getParameterNames();
      while(en.hasMoreElements()) 
      { 
          Object obj=en.nextElement(); 
          String param=(String)obj; 
          String pvalue=req.getParameter(param); 
          pwriter.print("Parameter Name: "+param+  
             " Parameter Value: "+pvalue); 
      } 
      pwriter.close();   
      
    }
}