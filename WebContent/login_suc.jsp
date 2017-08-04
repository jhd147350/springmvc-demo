<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>suc</title>
</head>
<body>
	<%
		String username = "";
		if (session.getAttribute("username") != null) {
			username = session.getAttribute("username").toString();
		}
	%>
	<h1>
		欢迎<%=username%></h1>
</body>
</html>