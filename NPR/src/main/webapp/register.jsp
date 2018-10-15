
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
<h1>注册</h1>
<form >
<p>姓名：<input type="text" name="username" id="username"></p>
<p>密码：<input type="password" name="password" id="password"></p>
<p>部门:<select name="department" id="department">
    <option value="销售部">销售部</option>
    <option value="采购部">采购部</option>
    <option value="仓管部">仓管部</option>
    </select>
</p>
<p>职位:<select name="job" id="job">
    <option>经理</option>
    <option>管理员</option>
    <option>员工</option>
</select>
</p>
    <p><input type="button" value="注册" id="btn1"></p>

</form>

<script>
$(function () {
    $("#btn1").click(function () {
        var username=$("#username").val()
        var password=$("#password").val()
        var department=$("#department").val()
        var job=$("#job").val()

            $.ajax({
                url:"addUser",
                data:{username:username,password:password,department:department,job:job},
                dataType:"json",
                type:"POST",
                success:function(data) {
                    if (data = 1) {
                         alert("添加成功！");
                         location.href="login.jsp";

                    }else{
                        alert("添加失败！");
                    }
                }
            })
    })
})
</script>
</body>
</html>
