<%@ page contentType="text/html; charset=utf-8"%>
<html>
  <head>
    <title>Message</title>
  </head>
  <body>
  <div align="center">
   <form action="/j2j/loginservlet"   method="post">
  学号: <input name="sno" type="text" id="sno"  >
  <br>
  姓名: <input name="sname" type="text" id="sname"  >
  <br>
 密码:&nbsp;&nbsp;&nbsp;<input name="spass" type="password" id="spass"> 
  <br>
  <input type="submit" name="submit" value="提交">
  
  </form>
  </div>
  </body>
</html>
