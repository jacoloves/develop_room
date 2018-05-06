<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Fruit" %>
<%
	Fruit f = (Fruit) application.getAttribute("fruit");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出力結果</title>
</head>
<body>
	<p><%= f.getName() %>の値段は<%= f.getPrice() %>円です。</p>
</body>
</html>