
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <%@include file="commons/basepath.jsp"%>
    <title>Title</title>
</head>
<body>
<form method="post" action="user/zhuce" >
    <p>用户名<input name="userName" id="username">
        <span id="msg"></span>
    </p>
    <p>密码<input type="password" name="userPwd" id="pwd"></p>
    <p>确认密码<input type="password" name="qruserPwd" id="qruserPwd"> <span id="msg1"></span> ${msg1}</p>
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
        $("#qruserPwd").blur(function () {
            var pwd=$("#pwd").val();
            var qrpwd=$("#qruserPwd").val();
            if (pwd!=qrpwd){
                $("#msg1").text("密码不一致");
            }else{
                $("#msg1").text(" ");
            }
        })

    });

</script>
</body>
</html>
