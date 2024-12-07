<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>select data from table</title>
</head>
<body>
<h1>Retrieve data from table</h1>
<%@page import="java.util.*" %>
<%@page import="com.model.*" %>
<%
@SuppressWarnings("unchecked") List<StudentData> list = (List<StudentData>) request.getAttribute("slist");
%>
<table border="1">
<tr><th>Student Id</th><th>Student Name</th></tr>
<%
for(StudentData s:list) {
%>
<tr>
<td><%=s.getStudid() %></td>
<td><%=s.getStuname() %></td>
</tr>
<%} %>
</table>
</body>
</html>