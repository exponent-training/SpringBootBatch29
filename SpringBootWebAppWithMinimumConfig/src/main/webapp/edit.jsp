<%@page import="com.example.demo.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>
<% Employee e = (Employee)request.getAttribute("emp"); %>
<form action="up">
       <input type="hidden" name="id" value="<%=e.getId()%>"> 
    NAME     : <input type="text" name="name" value="<%=e.getName()%>"><br><br>
    ADDRESS  : <input type="text" name="address" value="<%=e.getAddress()%>"><br><br>
    USERNAME : <input type="text" name="uname" value="<%=e.getUname()%>"><br><br>
    PASSWORD : <input type="text" name="pass" value="<%=e.getPass()%>"><br><br>
    <input type="submit" value="Update">
</form>
</body>
</html>