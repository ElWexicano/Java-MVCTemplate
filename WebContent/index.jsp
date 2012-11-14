<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The View</title>
</head>
<body>
	<h1><%= request.getParameter("message") %></h1>
	<p>You have visited this page <%= request.getParameter("number") %> times</p>
</body>
</html>