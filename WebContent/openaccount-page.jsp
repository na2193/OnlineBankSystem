<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="openAccountForm" action="OpenAccount" method="post">
		Account Type: <select name="accountType">
			<option>Checking Account</option>
			<option>Saving Account</option>
			<option>Credit Card</option>
		</select> <br/><br/>
			
		Minimum Deposit: <input type="text" name="minDeposit" required> <br/><br/>
		
		<input type="submit" value="Submit" name="btnopenAccount">
	</form>
</body>
</html>