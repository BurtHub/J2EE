<%@ page contentType="text/html; charset=utf-8"%>


<%if (session.getAttribute("username")==null){
  response.sendRedirect("error.jsp");} 
 %>
<html>
  <head>
    
    
    <title>Login</title>
    
	<jsp:include page="homepage.jsp"/>

  </head>
  
  <body>
  
   <form action="checklogin.jsp"   method="post">
  用户名: <input name="username" type="text" id="username" >
  <br>
  旧密码:&nbsp;&nbsp;&nbsp;<input name="password" type="password" id="pw"> 
  <br>
  新密码:&nbsp;&nbsp;&nbsp;<input name="password" type="password" id="pw"> 
  <br>
  <input type="submit" name="submit" value="修改">
  
  </form>
  </body>
</html>
