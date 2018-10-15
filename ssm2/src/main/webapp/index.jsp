<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="commons/basepath.jsp"%>
</head>
<body>
<h2>Hello World!</h2>
<form method="post" action="user/login1">
    <p>用户名<input name="userName"></p>
    <p>密码<input type="password" name="userPwd"></p>
    <div>
        <input class="input-text size-L" name="vericode" type="text" placeholder="验证码"  style="width:150px;">
        <img id="imageCode" src="imageCode"> <a id="kanbuq" href="javascript:changeCode();">看不清，换一张</a> </div>
    <p><input type="submit" value="提交"></p>
    <p style="color:red">${msg}</p>
</form>

<script type="text/javascript">

    function changeCode(){
        $("#imageCode").attr("src","imageCode?"+Math.random())
    }
</script>
</body>
</html>