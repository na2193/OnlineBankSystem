<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Online Bank of US</h2>
	
	<div style="float:left;">
		<img src="Pics/welcome-page.jpg">
	</div>
	
	<div style="float:left;">
		<form name="login" action="ValidateLogin" method="post">
			Username: <input type="text" name="username" id="username" required>
			<br/><br/>
			Password: <input type="password" name="password" id="password" required> 
			<br/><br/>
			<input type="submit" name="submit" value="Login" id="btnLogin">
		</form>
		
		<form name="register" action="register-page.jsp">
			<input type="submit" name="submit" value="Register" id="btnRegister">
		</form>
	
	</div>
</body>
</html>