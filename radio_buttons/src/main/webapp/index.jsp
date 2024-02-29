<html>
<head>
<style>
form {
	width: 40%;
	height: 60%;
	border: 2px solid red;
	background-color: aqua;
	font-size: 20px;
	padding: 20px;
}
</style>
</head>
<body>



	<form action="action" method="post">

		<label>First Name </label> <input type="text" name="fn"><br>
		<label>Last Name </label> <input type="text" name="ln"><br>
		<h1>Select your course</h1>
		<input type="radio" name="course" value="java"> JAVA <br> <input
			type="radio" name="course" value="sql"> SQL <br> <input type="radio"
			name="course" value="web"> WEB <br> <input type="radio"
			name="course" value="testing"> TESTING <br> <input type="radio"
			name="course" value="python"> PYTHON <br>
			<br>
		<input type="submit" value="submit">
	</form>
</body>
</html>
