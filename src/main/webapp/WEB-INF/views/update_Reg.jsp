<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update here..</h1>
<form action="Update">
<pre>
<input type="hidden" name="id" value="${reg.id}"/>
name<input type="text" name="name" value="${reg.name}"/>
city<input type="text" name="city" value="${reg.city}"/>
email<input type="text" name="email" value="${reg.email}"/>
mobile<input type="text" name="mobile" value="${reg.mobile}"/>
<input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>