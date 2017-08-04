<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="dologin.jsp" method="post">
		<p>
			<label>用户名：</label>
			<input name="username" value=""/>
			<label>密码：</label>
			<input type="password" name="password" value=""/>
		</p>
		<p>
		<input type="submit" value="登录" class="login"/> 
		</p>
	</form>
	
	<jsp:useBean id="user" class="jhd.User"/>
	用户名：<%=user.getUsername() %>
</body>
</html>