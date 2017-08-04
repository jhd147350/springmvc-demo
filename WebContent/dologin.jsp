<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="user" class="jhd.User" />
<jsp:setProperty property="*" name="user" />

<%
	///String username = "";
	///String password = "";
	//request.setCharacterEncoding("utf-8");
	//username = request.getParameter("username");
	//password = request.getParameter("password");

	if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {

		session.setAttribute("username", user.getUsername());
		request.getRequestDispatcher("login_suc.jsp").forward(request, response);
	} else {
		response.sendRedirect("login_fail.jsp");
	}
%>
