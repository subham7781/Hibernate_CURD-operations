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
<h1>Registration here..</h1>
<form action="saveReg">
<pre>
name<input type="text" name="name"/>
city<input type="text" name="city"/>
email<input type="text" name="email"/>
mobile<input type="text" name="mobile"/>
<input type="submit" value="save"/>
</pre>
</form>
 ${msg}
</body>
</html>