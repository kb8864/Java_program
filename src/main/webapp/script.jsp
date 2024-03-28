<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.print("<h1>スクリプトレット</h1>");

	int sum = 0;
	for (int i = 1; i <= 100; i = i + 1){
		sum = sum + i;
	}
	out.println("合計値:" + sum);
	%>
<hr>
合計<%= sum %>

<hr>
<% String id = request.getParameter("id"); %>

<%= id %>

</body>
</html>