<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	
	<body>
	
	<h2>Select an option!</h2>
	<form action="${pageContext.servletContext.contextPath}/addNumbers" method= "post">
		<Table>
			<tr>
				<td><input type="submit" name="adding" size="12" value="Add 3 Number" /></td>
			</tr>
		</Table>
	</form>
	
	<form action="${pageContext.servletContext.contextPath}/multiplyNumbers" method= "post">
		<Table>
			<tr>
				<td><input type="submit" name="multiply" size="12" value="Multiply Numbers" /></td>
			</tr>
		</Table>
	</form>
	
	<form action="${pageContext.servletContext.contextPath}/guessingGame" method= "post">
		<Table>
			<tr>
				<td><input type="submit" name="startGame" size="12" value="Guessing Game" /></td>
			</tr>
		</Table>
	</form>
	
	</body>
</html>
