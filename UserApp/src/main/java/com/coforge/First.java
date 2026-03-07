package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public First() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        RequestDispatcher rd = null;

        boolean isValid = false;

       
        Map<String, String> matchedUser = null;

        for (Map<String, String> user : SignupServlet.userSet) {
            if (user.get("uname").equals(uname) && user.get("pwd").equals(pwd)) {
                isValid = true;
                matchedUser = user; 
                break;
            }
        }

        if (isValid) {
            request.setAttribute("uname", uname);

            if (matchedUser != null) {
                request.setAttribute("email", matchedUser.get("email"));
                request.setAttribute("mobile", matchedUser.get("mobile"));
               }

            rd = request.getRequestDispatcher("/Welcome.jsp");
            rd.forward(request, response);
        } else {
            rd = request.getRequestDispatcher("/Error.jsp");
            rd.forward(request, response);
        }
        out.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
