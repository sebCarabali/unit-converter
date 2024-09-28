<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h2 class="tab-title">Weight</h2>
<form>
	<div class="form-group">
		<label for="weight">Enter the weight to convert</label> <input
			type="number" name="weight" id="weight" />
	</div>
	<div class="form-group">
		<label for="unitFrom">Unit to convert from</label> <select
			name="unitFrom" id="unitFrom">
			<option value="">-- Select a unit --</option>
		</select>
	</div>
	<div class="form-group">
		<label for="unitTo">Unit to convert to</label> <select name="unitTo"
			id="unitTo">
			<option value="">-- Select a unit --</option>
		</select>
	</div>
	<button type="submit">Convert</button>
</form>