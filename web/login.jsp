<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/17
  Time: 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/login" method="post">
    账号：<input type="text" name="account" value="mayun"> <br>
    密码：<input type="password" name="password" value="123"><br>
    <select name="selectDay">
      <option value="0">不保存</option>
      <option value="1">7天免登录</option>
      <option value="2">30天免登录</option>
    </select>
    <br><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
