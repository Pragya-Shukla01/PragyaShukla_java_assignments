package com.coforge;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
    
   private static final long serialVersionUID=1L;
    public static Set<Map<String, String>> userSet = new HashSet<>();
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        Map<String, String> user = new HashMap<>();
        user.put("uname", uname);
        user.put("pwd", pwd);
        user.put("email", email);
        user.put("mobile", mobile);
 
        
        userSet.add(user);
 
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
}
