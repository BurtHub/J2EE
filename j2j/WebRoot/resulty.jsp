<%@ page contentType="text/html; charset=utf-8"%>
<html>
  <head>
    <title>Message</title>
  </head>
  <body>
  <div align="center">
   <form action="/j2j/showResult"   method="post">

  <input type="submit" name="submit" value="commit">
  <%	String sno =request.getParameter("sno");
		String sname=request.getParameter("sname");
		String spass=request.getParameter("spass");
		out.print(sno+"   "+sname+"   "+spass);
		
		
		
		 %>
		 <br>
		 欢迎<%=session.getAttribute("sno") %> 欢迎
		 <%=session.getAttribute("spass") %>密码
  </form>
  </div>
  </body>
</html>
