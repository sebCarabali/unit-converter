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
			<div class="tabs">
				<button class="tab" onclick="openTab(0)">Length</button>
				<button class="tab" onclick="openTab(1)">Weight</button>
				<button class="tab" onclick="openTab(2)">Temperature</button>
			</div>
			<div class="tab-content">
				<jsp:include page="./inc/length.jsp" />
			</div>
			<div class="tab-content">
				<jsp:include page="./inc/weight.jsp"></jsp:include>
			</div>
			<div class="tab-content">
				<jsp:include page="./inc/temperature.jsp"></jsp:include>
			</div>
		</div>
	</div>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/app.js"></script>
</body>
</html>