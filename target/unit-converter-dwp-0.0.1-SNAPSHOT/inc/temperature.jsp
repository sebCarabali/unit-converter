<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2 class="tab-title">Temperature</h2>
<form>
	<div class="form-group">
		<label for="temperature">Enter the temperature to convert</label> <input
			type="number" name="temperature" id="temperature" />
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