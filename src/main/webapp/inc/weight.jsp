<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2 class="tab-title">Weight</h2>
<form method="post" action="${pageContext.request.contextPath}/convert">
	<div class="form-group">
		<label for="value">Enter the weight to convert</label> <input
			type="number" name="value" id="value" required />
	</div>
	<div class="form-group">
		<label for="from">Unit to convert from</label> <select
			name="from" id="from" required>
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items='${units["MASS"]}'>
				<option value="${unit.symbol}">${unit.name}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label for="to">Unit to convert to</label> <select name="to"
			id="to" required>
			<option value="">-- Select a unit --</option>
			<c:forEach var="unit" items='${units["MASS"]}'>
				<option value="${unit.symbol}">${unit.name}</option>
			</c:forEach>
		</select>
	</div>
	<button type="submit">Convert</button>
</form>