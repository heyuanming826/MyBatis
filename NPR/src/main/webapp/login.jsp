
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <!--<script type="text/javascript" src="lib/html5shiv.js"></script>-->
    <!--<script type="text/javascript" src="lib/respond.min.js"></script>-->
    <![endif]-->
    <link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="static/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />

    <!--[if IE 6]>
    <!--<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>-->
    <!--<script>DD_belatedPNG.fix('*');</script>-->
    <![endif]-->
    <title>NPR 4s店管理系统</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" method="post">
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="username" name="username" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <select id="department" name="department">
                        <option>销售部</option>
                        <option>采购部</option>
                        <option>仓管部</option>
                    </select>
                </div>

            </div>
            <span  id="msg" ></span>
            <p style="color:red">${msg}</p>
            <p style="color:red">${msg1}</p>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input class="input-text size-L" id="vericode" name="vericode" type="text" placeholder="验证码"
                           style="width:150px;">
                    <img id="imageCode" src="imageCode"> <a id="kanbuq" href="javascript:changeCode();">看不清，换一张</a> </div>

            </div>

            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id="btnLogin" type="button" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                    <input  name="" type="button" id="zhuce" class="btn btn-default radius size-L" value="&nbsp;注&nbsp;&nbsp;&nbsp;&nbsp;册&nbsp;">
                </div>
            </div>

        </form>
    </div>

</div>
<div class="footer">Copyright 牛耳教育</div>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="js/layer/2.4/layer.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>


<script type="text/javascript">

    $(function(){
        $("#btnLogin").click(function(){

            var username=$.trim($("#username").val());
            var password=$.trim($("#password").val());
            var vericode=$.trim($("#vericode").val());
            var department=$.trim($("#department").val());
            if(!username){
                alert("请输入账户名！");
                return;
            }

            if(!password){
                alert("请输入密码！");
                return;
            }

            if(!vericode){
                alert("请输入验证码！");
                return;
            }

            $.ajax({
                url:"select",
                data:{username:username,password:password,vericode:vericode,department:department},
                dataType:"text",
                type:"GET",
                success:function(data) {

                    if (data == "mm") {

                       alert("用户或密码错误")

                    }else if(data == "y") {
                        alert("验证码码错误")
                    }else{
                        location.href="index.jsp";
                    }
                }
            })

        });

        $("#zhuce").click(function(){
            //window.open("register.jsp")
            location.href="register.jsp";
        });

    });


    /*
        获取验证码
    */
    function changeCode(){
        $("#imageCode").attr("src","imageCode?"+Math.random())
    }
</script>
</body>
</html>
