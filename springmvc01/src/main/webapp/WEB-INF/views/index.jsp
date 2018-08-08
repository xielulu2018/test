<%--
  Created by IntelliJ IDEA.
  User: lucas
  Date: 2018/8/6
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  request:  ${requestScope.aaa}
    <br>
  session:  ${sessionScope.aaa}
    <br>
    ${requestScope.time}

<br>

<a href="download?filename=19608.docx&id=1">19608.docx</a>
</body>
</html>
