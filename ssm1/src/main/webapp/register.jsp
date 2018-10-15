
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <%@include file="commons/basepath.jsp"%>
    <title>Title</title>
</head>
<body>
<form method="post" action="user/reg">
    <p>用户名：<input name="userName" id="username" required>
        <span id="msg"></span>
    </p>
    <p>密码：<input type="password" name="userPwd" required></p>
    <p>性别：
        <label>
            <input type="radio" name="userSex" value="男" checked>男
        </label>
        <label>
            <input type="radio" name="userSex" value="女">女
        </label></p>
    <p>邮箱：<input type="email" name="userEmail"></p>
    <p><input type="submit" value="提交"></p>
    <p style="color:red">${msg}</p>
</form>
<script>
    $(function () {

        $("#username").blur(function () {
            $.ajax({
                url:"user/checkName",
                data:{"username":$("#username").val()},
                success:function (data) {
                    $("#msg").text(data);
                }
            })
        });
    });
</script>
</body>
</html>
