<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration</h2>
	
	<div>
		<form name="registration" action="RegisterServlet" method="post">
			Enter your First Name:<br/> <input type="text" name="firstname" id="firstname" required> <br/>
			Enter your Last Name:<br/> <input type="text" name="lastname" id="lastname" required> <br/>
			Enter your Email Address:<br/> <input type="text" name="email" id="email" required> <br/>
			<input type="submit" name="submit" value="Register" id="btnRegister">
		</form>
	</div>
</body>
</html>