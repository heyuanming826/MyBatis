<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/1
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="commons/basepath.jsp"%>
    <title>Title</title>
</head>
<body>
<p><input type="button" value="查所有" id="btnSearch"></p>
<ul id="booklist"></ul>
<script>
$(function () {
    $("#btnSearch").click(function () {
       $("#booklist li").remove();
        $.ajax({
            url:"books",
            dataType:"json",
            success:function (data) {
                $.each(data,function () {
                    var $li=$("<li>"+this.title+"&nbsp;&nbsp;&nbsp;"+this.author.name+"</li>");
                    $("#booklist").append($li);
                })

            }

        })
    })

})
</script>
</body>
</html>
