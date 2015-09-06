<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<fieldset>
		<legend>Login</legend>
		<form action="/nadisaweb/user/authenticate">
			<table>
				<tr> 
					<td>User Id</td>
					<td><input name="userid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">Login</button>
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>