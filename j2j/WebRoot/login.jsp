<%@ page contentType="text/html; charset=utf-8"%>
<html>
  <head>
    <title>Login</title>   
	<%@include file="/houtai/meidenglu.jsp" %>
  </head> 
  <body>
  <div align="center">
   <form action="/j2j/houtai/checklogin.jsp"   method="post">
  用户名 : <input name="username" type="text" id="username"  >
  <br>
  <br>
  &nbsp;密&nbsp;码 &nbsp;: <input name="password" type="password" id="pw"> 
  <br>
  <input type="submit" name="submit" value="登陆">
  
  </form>
  </div>
  </body>
</html>
