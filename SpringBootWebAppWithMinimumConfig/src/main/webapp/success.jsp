<%@page import="com.example.demo.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Success Page</h1>
<%List<Employee> elist = (List<Employee>)request.getAttribute("list");%>
<form name="mypage">
<table border="4" style="background-color: #C1C4C4">
   <thead>
      <tr>
         <th>SELECT</th>
         <th>ID</th>
         <th>NAME</th>
         <th>ADDRESS</th>
         <th>USERNAME</th>
         <th>PASSWORD</th>
         <th>EDIT</th>
         <th>DELETE</th>
      </tr>
   </thead>
   <tbody>
     <tr>
     <% for(Employee e : elist) { %>
      <td><input type="radio" value="<%=e.getId() %>" name="id"></td> 
      <td><%=e.getId() %></td>
      <td><%=e.getName() %></td>
      <td><%=e.getAddress() %></td>
      <td><%=e.getUname() %></td>
      <td><%=e.getPass() %></td>
      <td><input type="submit" onclick="editData();" value="Edit"></td>
      <td><input type="submit" value="Delete"></td>
     </tr>
     <% } %>
   </tbody>
</table>
</form>
</body>
<script type="text/javascript">
function editData() {
	alert("Hi Edit Calling");
	document.mypage.action="edit";
	document.mypage.submit();
}
</script>
</html>