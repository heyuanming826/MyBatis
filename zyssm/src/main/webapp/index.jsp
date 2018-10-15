<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="commons/basepath.jsp"%>
</head>
<body>
<h2>Hello World!</h2>
<form method="post" action="user/login">
    <p>用户名：<input name="userName"></p>
    <p>密码：<input type="password" name="userPwd"></p>
    <p><input id="vericode" name="vericode" type="text" placeholder="验证码" style="width:150px;">
        <img id="imgCode" src="user/imageCode"> <a id="kanbuq" href="javascript:changeCode();">看不清，换一张</a> </p>
    <p><input type="submit" value="提交"></p>
    <p style="color:red">${msg}</p>
    <p style="color:red">${msg1}</p>
</form>
<script type="text/javascript">
    /*
        获取验证码
    */
    function changeCode(){
        $("#imgCode").attr("src","user/imageCode?"+Math.random())
    }
</script>
</body>
</html>
