<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
    <style >
       *{
           margin: 10px;
           padding: 10px;
       }
    </style>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />

    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />

    <!--/meta 作为公共模版分离出去-->

    <title>栏目设置</title>


</head>
<body>
<form>
                出库申请单
                <hr>
                <p>  客户订单号：<input class="input-text" type="text" id="customerordid" name="customerordid"></p>>
                <p>   车辆类型：
                    <select class="select"  name="carid" id="carid">
                    <option value="1">东风标致308</option>
                    <option value="2">东风标致5008</option>
                    <option value="3">东风标致408</option>
                    <option value="4">东风标致2008</option>
                    <option value="5">东风标致3008</option>
                        <option value="6">东风标致4008</option>
                        <option value="7">东风标致301</option>
                        <option value="8">东风标致308s</option>
                    </select></p>
                <p>      出库日期：<input type="date" class="input-text" id="outtime"  name="outtime"></p>
                <p>  数量：<input type="text" class="input-text" id="outquantity" name="outquantity"></p>
                  <p> 车架号：<input type="text" class="input-text" id="vin" name="vin"></p>
                <p>  申请人：<input type="text" class="input-text"  id="worker" name="worker"></p>
                <p>  备注:<textarea name="remark" id="remark" cols="" rows="" class="textarea"  placeholder="" datatype="*10-100" dragonfly="true" ></textarea></p>
                <p>  <input class="btn btn-primary radius" type="button" id="tijiao" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"></p>

    </form>


<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
    $(function(){
            $("#tijiao").click(function () {
                var customerordid = $("#customerordid").val()
                var carid = $("#carid").val()
                var outtime = $("#outtime").val()
                var outquantity = $("#outquantity").val()
                var vin = $("#vin").val()
                var worker = $("#worker").val()
                var remark = $("#remark").val()
                $.ajax({
                    url:"addOutstorage1",
                    data:{customerordid:customerordid,carid:carid,outtime:outtime,outquantity:outquantity,vin:vin,worker:worker,remark:remark},
                    dataType:"json",
                    type:"POST",
                    success:function(data) {
                        if (data > 0) {
                            alert("添加成功！");


                        }else{
                            alert("添加失败！");
                        }
                    }
                })

        })
    });


    // $("#tijiao").click(function(){
    //     var url="http://localhost:8080/chengliang/"
    //     alert("aaa");
    //     $.ajax({
    // 		url:"inStorage",
    // 		Type:"GET",
    // 		success:function(data){
    // 		    if(data===1){
    // 		        alert("提交成功，等待审核！");
    // 			}
    // 		}
    // 	})
    // })
</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>