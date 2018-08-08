<%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 2018/8/6
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <a href="hello">test Map</a>
    <br>
    <a href="testSessions">test Sessions</a>
    <br>
    <a href="testModelAndView">test   ModelAndView</a>
<br>


<form action="testModelAttr" method="post">
    <input type="hidden" name="id" value="1">
  姓名：  <input type="text" name="name" value="xll"/>
    <br>
  年龄：  <input type="text" name="age" value="12"/>
    <input type="submit" value="提交"/>
</form>

<br>

<form action="testUpload" method="post" enctype="multipart/form-data">
    <input type="hidden" name="id" value="1">
    File:<input type="file" name="file" />
    <br>
    Desc:<input type="text" name="desc"/>
    <input type="submit" value="上传">
</form>



<a href="testException?id=10">test Exception</a>
</body>
</html>
