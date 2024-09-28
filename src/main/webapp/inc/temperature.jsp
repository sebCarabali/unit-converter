<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2 class="tab-title">Temperature</h2>
<form action="${pageContext.request.contextPath}/convert" method="post">
	<div class="form-group">
		<label for="value">Enter the temperature to convert</label> <input
			type="number" name="value" id="value" />
	</div>
	<div class="form-group">
		<label for="from">Unit to convert from</label> <select name="from"
			id="from" required>
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items='${units["TEMPERATURE"]}'>
				<option value="${unit.symbol}">${unit.name}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="to">Unit to convert to</label> <select name="to" id="to"
			required>
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items='${units["TEMPERATURE"]}'>
				<option value="${unit.symbol}">${unit.name}</option>
			</c:forEach>
		</select>
	</div>
	<button type="submit">Convert</button>
</form>