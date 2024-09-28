<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/styles.css" />
</head>
<body>
	<div class="content">
		<div style="text-align: center;">
			<jsp:include page="./layout/header.jsp">
				<jsp:param value="Convert all type of units" name="subtitle" />
			</jsp:include>
		</div>

		<div class="content">
			<div class="result-wrapper">
				<div class="from">${value}${from}</div>
				<div class="to-word">to</div>
				<div class="to">${to}</div>
				<div class="equal">=</div>
				<div class="result">${result}</div>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/app.js"></script>
</body>
</html>