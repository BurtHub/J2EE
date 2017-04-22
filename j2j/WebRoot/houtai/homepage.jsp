<%@ page contentType="text/html; charset=utf-8"%>



<html>
  <head>
    
    
    <title>主页面</title>
    
	

  </head>
  
  <body>
  
  <a href="login.jsp">切换用户</a>
  <a href="sign.jsp">注册博客</a>
  <a href="writeblog.jsp">写博客</a>
  <a href="changepassword.jsp">修改密码</a> 
  <a href="userpage.jsp">个人主页</a> 
  <a href="clearsession.jsp">退出登录</a> 
  <a href="userpage.jsp" ><%=session.getAttribute("username") %></a>
  <hr>
  
  <br>
  </body>
</html>
