<%@ page pageEncoding="UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
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

<title>NPR 4S店管理系统</title>
<meta name="keywords">
<meta name="description">
</head>
<body>
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">NPR 4s店</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a> 
			<span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.1</span> 
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
	
		<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li id="state"></li>

				<li class="dropDown dropDown_hover" id="li">
					<a href="#" class="dropDown_A" id="username"> </a>
					<%--<ul class="dropDown-menu menu radius box-shadow">--%>

						<%--<li><a href="#">修改账户密码</a></li>--%>
						<%--<li><a href="#">退出</a></li>--%>
				<%--</ul>--%>
			</li>
				<li id="dl"><a href="login.jsp">登录</a></li>
				<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
				<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
						<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
						<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
						<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
						<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
						<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</div>
</div>
</header>
<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i><a data-href="welcome.jsp" data-title="首页" href="javascript:;"> 首页</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		
	</dl>
		<dl id="menu-picture">
			<dt><i class="Hui-iconfont">&#xe613;</i><a id="qinggou" data-title="请购单">请购单</a> <i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		      
	</dl>
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i><a id="caigou" data-title="采购订单表" >采购订单</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		      
	</dl>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i><a id="xiaoshoudingdan" data-title="销售订单表" > 销售订单</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		  
	</dl>
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i> <a id="chukudan" data-title="出库信息表" >出库单</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		
	</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i><a id="xiaoshouxinxi" data-title="销售表信息" >销售表</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		
	</dl>
	<dl id="menu-admin1">
			<dt><i class="Hui-iconfont">&#xe62d;</i><a id="kucun" data-title="库存信息表" >库存信息表</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		
	</dl>
	<dl id="menu-admin2">
			<dt><i class="Hui-iconfont">&#xe62d;</i><a id="chuku" data-title="出库信息表" >出库信息表</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		
	</dl>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> <a id="xiaoshoutu" data-title="销售图表" >销售图表</a><i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="charts-1.html" data-title="折线图" href="javascript:void(0)">按月份</a></li>
					<li><a data-href="charts-2.html" data-title="时间轴折线图" href="javascript:void(0)">按销售部人员</a></li>
					<li><a data-href="charts-3.html" data-title="区域图" href="javascript:void(0)">按汽车类型</a></li>
					
			</ul>
		</dd>
	</dl>
		
</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active">
					<span title="首页" data-href="welcome.html">首页</span>
					<em></em></li>
		</ul>
	</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="welcome.jsp"></iframe>
	</div>
</div>
</section>

<div class="contextMenu" id="Huiadminmenu">
	<ul>
		<li id="closethis">关闭当前 </li>
		<li id="closeall">关闭全部 </li>
</ul>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url:"xxUser",
		dataType:"json",
		success:function (data) {
            if (data!=null) {
                $("#dl").hide();
                $("#a1").append("<i class=\"Hui-iconfont\">&#xe6d5;</i>")
                var state;
                if (data.job == "经理") {
                    state = '经理'
                } else if (data.job == "管理员") {
                    state = '管理员'
                } else if (data.job == "员工") {
                    state = '员工'
                }
                if (data.department =="仓管部"){
                    $("#menu-picture").hide();
                    $("#menu-product").hide();
                    $("#menu-comments").hide();
                    $("#menu-admin").hide();
                    $("#menu-tongji").hide();
                    $("#chukudan").attr("data-href","outcarapply.jsp");
                    $("#kucun").attr("data-href","kucun.jsp");
                    $("#chuku").attr("data-href","chuku.jsp");
				}else if(data.department=="采购部"){
                    $("#menu-comments").hide();
                    $("#menu-member").hide();
                    $("#menu-admin").hide();
                    $("#menu-admin2").hide();
                    $("#menu-tongji").hide();
                    $("#kucun").attr("data-href","kucun.jsp");
                    $("#caigou").attr("data-href","caigou.jsp");
                    $("#qinggou").attr("data-href","qinggou.jsp");
				}else if(data.department=="销售部"){
					if(data.job=="员工"){
                        $("#menu-product").hide();
                        $("#menu-admin").hide();
                        $("#menu-admin2").hide();
                        $("#menu-tongji").hide();
                        $("#qinggou").attr("data-href","qinggou.jsp");
                        $("#chuku").attr("data-href","chuku.jsp");
                        $("#kucun").attr("data-href","kucun.jsp");
                        $("#xiaoshoudingdan").attr("data-href","xiaoshoudingdan.jsp");
					}else{
                        $("#menu-picture").hide();
                        $("#menu-product").hide();
                        $("#menu-member").hide();
                        $("#menu-admin1").hide();
                        $("#menu-admin2").hide();
                        $("#xiaoshoudingdan").attr("data-href","xiaoshoudingdan.jsp");
                        $("#xiaoshoutu").attr("data-href","xiaoshoutu.jsp");
                        $("#xiaoshouxinxi").attr("data-href","xiaoshouxingxi.jsp");
					}
				}
                $("#state").text(state);
                $("#username").prepend(data.username+"<i class=\"Hui-iconfont\">&#xe6d5;</i>");
				$("#li").prepend("<ul class=\'dropDown-menu menu radius box-shadow\'> <li><a href=\"javascript:xiugai1();\" >修改账户密码</a></li> <li><a href=\"javascript:esc1();\">退出</a></li> </ul>");
            }
        }
	})
});
function esc1(){
    if(confirm("确定要退出吗")){
        location.href="esc";
    }
}
/*用户修改密码*/
function xiugai1(){
    location.href="changepwd.jsp";
}
/*个人信息*/
function myselfinfo(){
	layer.open({
		type: 1,
		area: ['300px','200px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: '查看信息',
		content: '<div>管理员信息</div>'
	});
}

/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}


</script> 

<!--此乃百度统计代码，请自行删除-->
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
<!--/此乃百度统计代码，请自行删除-->
</body>
</html>