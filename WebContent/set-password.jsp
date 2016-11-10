<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Set Password</title>
</head>
<body>
	<form name="setPassword" action="SetPassword" method="post">
			Enter Password:<br/> <input type="password" name="password" id="firstname" required> <br/>
			Re-enter Password:<br/> <input type="password" name="verifyPassword" id="lastname" required> <br/>
			<input type="submit" name="submit" value="Submit" id="btnSetPassword">
	</form>
</body>
</html>