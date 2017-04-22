<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<link href="style.css" type="text/css" rel="stylesheet">
		<title>主页面</title>
	</head>
	<body>
		<div id="container">
			<div id="banner">
				<h1>
					博客平台系统
				</h1>
			</div>
			<div id="menu">
				<a href="userpage.jsp">个人主页</a>
				<a href="writeblog.jsp">写博客</a>
				<a href="../BlogList.jsp">博文管理</a>
				<a href="login.jsp">切换用户</a>
				<a href="changepassword.jsp">修改密码</a>
				<a href="clearsession.jsp">退出登录</a>
				<a href="userpage.jsp"><%=session.getAttribute("username")%></a>
				<hr>				
				<br>
			</div>

			<br>
	</body>
</html>
