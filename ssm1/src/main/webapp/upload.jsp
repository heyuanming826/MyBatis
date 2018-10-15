<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/2
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="commons/basepath.jsp"%>
    <title>Title</title>
</head>
<body>
<form method="post" action="upload" enctype="multipart/form-data">
    <p>上传照片：<input type="file" name="myPic"></p>
    <p><input type="submit" value="提交"></p>
</form>
</body>
</html>
