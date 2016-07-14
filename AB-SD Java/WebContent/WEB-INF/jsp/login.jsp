<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/login.css">
<link rel="stylesheet" type="text/css" href="../css/style-1.css">
<title>Login</title>
</head>
<body class="bg">
	<jsp:include page="menu.jsp"/>
	<div class="container">
		<div class="vertical-middle">
			<div class="main login-form">
				<form:form modelAttribute="User" action="" method="post">
					<div class="header">
						<h2>Login</h2>
					</div>
					<table>
						<tr>
							<td class="col-left">Email:</td>
							<td><form:input path="email"/></td>
						</tr>
						<tr>
							<td class="col-left">Password:</td>
							<td><form:password path="password"/>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Login"></td>
						</tr>
						<tr>
							<td>
								${message }
							</td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>