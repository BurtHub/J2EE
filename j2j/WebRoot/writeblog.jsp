<%@ page contentType="text/html; charset=utf-8"%>



<html>
  <head>
   <title>主页面</title>
  </head>
  
  <body>
 <jsp:include page="/houtai/homepage.jsp"/>
 <%if (session.getAttribute("username")==null){
 response.sendRedirect("error.jsp");} %>
 欢迎<%=session.getAttribute("username") %>登录
  
  <br>
  <p>请您输入您的博文内容</p>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="">
  <table width="629" border="0">
    <tr>
      <td width="76">主题：</td>
      <td width="543"><label>
        <input name="title" type="text" id="title" size="60" />
      </label></td>
    </tr>
    <tr>
      <td>类别：</td>
      <td><label>
        <select name="select" id="select">
          <option value="2">心情故事</option>
          <option value="3">旅游故事</option>
        </select>
      </label></td>
    </tr>
    <tr>
      <td>内容：</td>
      <td><label>
        <textarea name="textfield" cols="60" rows="8" id="textfield"></textarea>
      </label></td>
    </tr>
    <tr>
      <td><label>
        <input type="reset" name="button" id="button" value="重置" />
      </label></td>
      <td><label>
        <input type="submit" name="button2" id="button2" value="提交" />
      </label></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</form>
<p>&nbsp; </p>
  </body>
</html>
