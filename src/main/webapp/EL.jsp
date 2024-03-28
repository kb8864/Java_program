<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL式とJSTL(カスタムタグ)</title>
</head>
<body>
	<h1>EL式とJSTL(カスタムタグ)</h1>
	<p>ID(EL式):${param.id}</p>
	<p>
		ID(JSTL使用)：
		<c:out value="${param.id}" />
	</p>
	<p>
		ID(カンマ区切り)：
		<fmt:formatNumber value="${param.id}" />
	</p>
</body>
</html>