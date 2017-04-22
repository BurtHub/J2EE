<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>CheckingLoging</title>
	</head>
	<%
		session.invalidate();
		response.sendRedirect("login.jsp");
	%>
	<body>
		<%="不知道为什么，突然想加个注释 "%>
	</body>
</html>
