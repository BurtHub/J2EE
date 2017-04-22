<%@ page contentType="text/html; charset=utf-8"%>


<%if (session.getAttribute("username")==null){
  response.sendRedirect("error.jsp");} 
 %>
<html>
  <head>
   <title>个人主页</title>
  </head>
  
  <body>
 <jsp:include page="/houtai/homepage.jsp"/>
 你的个人主页
  
  <br>
  </body>
</html>