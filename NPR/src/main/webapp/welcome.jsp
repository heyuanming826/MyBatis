<%@ page pageEncoding="UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@include file="commons/basepath.jsp" %>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<style>
	.div{
		padding: 10px;
		margin-left: 30px;
	}
	.div1{
		padding: 10px;
		margin-left: 130px;
		  border: 1px solid white;
		background-color: gray;
		width: 1230px;
		float: left;
	}
	.div2{
		margin: 10px;
		padding: 10px;
		  border: 1px solid white;
		background-color:white;
		width: 368px;
		height: 400px;
		float: left;
	}
	.div3{
		margin: 10px;
		padding: 10px;
		border: 1px solid white;
		background-color:white;
		width: 368px;
		height: 400px;
		float: left;
	}
	.div4{
		margin: 10px;
		padding: 10px;
		  border: 1px solid white;
		background-color:white;
		width: 368px;
		height: 400px;
		float: left;
	}
	ul li{
	
		margin-left: -45px;
		
			padding: 10px;
		  list-style: none;
	}
	
</style>
<title>我的桌面</title>
</head>
<body>
<div class="div">
	<h1>汽车销售管理系统</h1>
</div>

<div class="div1">
	<c:forEach items="${pb.data}" var="product">
	<div class="div2">
	<ul class="ul">
	<li><img src="images/308.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>308</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
		<a href="product?pageNo=${pb.first }">首页</a>&nbsp;
		<a href="product?pageNo=${pb.up }">上一页</a>&nbsp;
		<a href="product?pageNo=${pb.down }">下一页</a>&nbsp;
		<a href="product?pageNo=${pb.last }">末页</a>&nbsp;
		当前第${pb.pageNo }页，共计${pb.pages }页
	</c:forEach>
<div class="div3">
	<ul class="ul1">
	<li><img src="images/408.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>408</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
<div class="div4">
	<ul >
	<li><img src="images/4008.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>4008</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
<div class="div2">
	<ul class="ul">
	<li><img src="images/2008.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>2008</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
<div class="div3">
	<ul class="ul1">
	<li><img src="images/308.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>308</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
<div class="div4">
	<ul >
	<li><img src="images/2008.jpg" width="360px" height="200px"></li>
	<li>东风标致</li>
	<li>2008</li>
	<li>报价:7.95-15.75万</li>
	<li><a href="">更多参数</a></li>
</ul>
</div>
</div>



</body>
</html>