<%@ page contentType="text/html; charset=utf-8"%>
<html>
  <head> 
    <title>CheckingLoging</title>
    <%@include file="/houtai/meidenglu.jsp" %>
    </head>  
   
    
    <%!String username=null;
	String userpassword=null; %>
<%
	request.setCharacterEncoding("utf-8");
 	username= request.getParameter("username");
	userpassword = request.getParameter("password");
	session.setAttribute("username",username);
	session.setAttribute("password",userpassword);
	if(username.equals("admin")&&userpassword.equals("123")){
		response.sendRedirect("userpage.jsp");
	}else{
		request.getRequestDispatcher("homepage.jsp");
		
	} %>
 
  <body>
  <h1>你的密码错误</h1>
  <br>
  <br>
  <a href="../login.jsp" fontsize=20px>重新登陆</a>
  <a href="freepass.jsp">免密码登陆</a>
   <br>
   <%=username+userpassword %>
   </form>
  </body>
</html>
