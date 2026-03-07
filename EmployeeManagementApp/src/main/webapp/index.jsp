<html>
<body>
<h2><%= "Hello World!" %></h2>
<%!int a=5,b=7 ; %>
<%= a+b %><br>

<%!String n="Pragya";int marks=90 ;int studid=123;%>
<%="Student Name: "+n%><br>
<%="Student marks: "+marks%><br>
<%="Student id: "+studid%><br>
<%!int num=78; %>
<%! String result=num%2==0?"even":"odd" ; %>
<%="Given number is "+num %>
<br>
<br>
<%=num+"  is "+result %>
</body>
</html>
