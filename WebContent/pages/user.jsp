<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Spring MVC表单处理</title>
</head>
<body>
	<h2>user Information</h2>
	<form method="POST" action="add">
		<table>
			<tr>
				<td><label >名字：</label></td>
				<td><input name="username" /></td>
			</tr>
			<tr>
				<td><label>密码：</label></td>
				<td><input name="password" type="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交表单" /></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
</html>