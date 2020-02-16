<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/12
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/testPost" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
</form>
<hr>
<form action="user/testGet" method="get">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
</form>
<hr>
<form action="user/testUser" method="get">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    Car:<input type="text" name="car.cname"><br>
    list:<input type="text" name="list[0].cname"><br>
    map:<input type="text" name="map['101'].cname"><br>
    date:<input type="date" name="birth"><br>
    <input type="submit" value="提交">
</form>
<hr>
<form action="user/testBody" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="提交">
</form>
<hr>
    <a href="user/testPathVariable/1000">1</a>
    <a href="user/testRequestHeader">2</a>
    <a href="user/testCookieValue">3</a>
</body>
</html>
