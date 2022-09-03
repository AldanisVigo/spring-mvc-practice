<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Form Example</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name:
			<form:input path="firstName"/>
			<br><br>
			Last Name:
			<form:input path="lastName"/>
			<br><br>
			Country:
			<%-- <form:select path="country">
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				<form:option value="India" label="India"/>
			</form:select> --%>
			<form:select path="country">
				<form:options items="${student.countryOptions}"/>
			</form:select>
			<br><br>
			Favorite Programming Language:
			Java : <form:radiobutton path="favoriteLanguage" value="Java"/>
			Dart : <form:radiobutton path="favoriteLanguage" value="Dart"/>
			Swift : <form:radiobutton path="favoriteLanguage" value="Swift"/>
			JS : <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
			<br><br>
			<input type="submit"/>
		</form:form>
	</body>
</html>