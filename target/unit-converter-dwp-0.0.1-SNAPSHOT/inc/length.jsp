<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2 class="tab-title">Length</h2>
<form action="${pageContext.request.contextPath}/convert-length" method="post">
	<div class="form-group">
		<label for="value">Enter the legth to convert</label> <input
			type="number" name="value" id="value" />
	</div>
	<div class="form-group">
		<label for="from">Unit to convert from</label> <select name="from"
			id="from">
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items="${lengthUnits}">
				<option value="${unit}">${unit}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="to">Unit to convert to</label> <select name="to" id="to">
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items="${lengthUnits}">
				<option value="${unit}">${unit}</option>
			</c:forEach>
		</select>
	</div>
	<button type="submit">Convert</button>
</form>