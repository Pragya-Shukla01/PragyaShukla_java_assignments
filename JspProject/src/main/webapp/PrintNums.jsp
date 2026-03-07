<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
      for(int i=1;i<=15;i++)
	   if(i%2==0)
	   out.println(i+"<br>");
	   %><br>
	   <%!  String fruits[]={"banana","apple","mango"};%>
	   <% for(String fruit: fruits)
		   out.println(fruit);%><br>
	 <%@ page import=" java.util.Date"%>
	 <%Date date=new Date(); %>
	 <%=date %>
	 <form>
	 <label>First Number:</label>
	 <input type="text" name="num1"><br>
	 <br>
	 <label> Second Number:</label>
	 <input type="text" name="num2">
	 <button type="submit">Power</button>
	 </form>
	 <%@ page import ="java.lang.Math" %>
	

 <%
    String p1 = request.getParameter("num1");
    String p2 = request.getParameter("num2");
 
    if (p1 != null && p2 != null) {
        try {
            double n1 = Double.parseDouble(p1);
            double n2 = Double.parseDouble(p2);
            
            double result = Math.pow(n1, n2);
            out.println("<h3>Result: " + result + "</h3>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Please enter valid numeric values.</p>");
        }
    }
%>

</body>
</html>