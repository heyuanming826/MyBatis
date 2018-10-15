
<%@ page pageEncoding="UTF-8"  language="java" %>
<html>
<head>
  <%@include file="commons/basepath.jsp" %>
  <title>Title</title>
  <script src="static/h-ui.admin/js/H-ui.admin.js"></script>
  <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
  <script type="text/javascript" src="js/layer/2.4/layer.js"></script>
  <script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>

  <script src="js/jquery.validation/1.14.0/jquery.validate.js"></script>
  <script src="js/jquery.validation/1.14.0/validate-methods.js"></script>
  <script src="js/jquery.validation/1.14.0/messages_zh.js"></script>

  <script src="js/hospital.js"></script>
</head>
<body>
<h1>修改密码</h1>
<form >
  <p>原始密码：<input type="password" name="password" id="password"></p>
  <p>新的密码：<input type="password" name="password1" id="password1"></p>
  <p>确认密码：<input type="password" name="password2" id="password2"></p>


  <p><input type="button" value="确认" id="btn1"></p>

</form>

<script>
    $(function () {
        $("#btn1").click(function () {
            var password=$("#password").val();
            var password1=$("#password1").val();
            var password2=$("#password2").val();


            //什麼多沒有 沒進控制層里    http://localhost:8080/NPR/changepwd.jsp
            $.ajax({
                type:"POST",
                url:"upUser1",
                data:{password:password,password1:password1,password2:password2},
                dataType:"json",
                success:function(data) {
                    if (data>0) {
                        alert("修改成功！");
                        location.href="login.jsp";

                    }else{
                        alert("修改失败！");
                    }
                }
            })
        })
    })
</script>
</body>
</html>
