<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
  <head>
    <%@include file="commons/basepath.jsp"%>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="js/Student.js"></script>
	
	<link rel="stylesheet" href="css/bootstrap.min.css" />
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./bootstrap.min.css">
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
  </head>
  <body>

    <!-- 页头 -->
    <div class="jumbotron jumbotron-fluid p-3">
      <div class="container">
        <h1 class="display-3">学籍管理平台</h1>
        <p class="lead">牛耳教育</p>
      </div>
    </div>
    
    <!-- 页面主体 -->
    <div class="container-fluid">
      <div class="row">

        <!-- 左侧 -->
        <div class="col-lg-3">
          <div class="card">
            <div class="card-body">
              <h4 class="card-title">添加新学员</h4>
              <!-- 创建新学员的表单 -->
              <form  >
                <!-- 姓名字段 -->
                <div class="form-group form-control-lg">
                  <label>姓名</label>
                  <input type="text" id="name"
                    class="form-control" name="name" placeholder="请输入学员姓名">
                </div>
                <!-- 手机号字段 -->
                <div class="form-group form-control-lg">
                  <label >手机号</label>
                  <input type="text" id="phone"
                    class="form-control" name="phone" placeholder="请输入手机号">
                </div>
                <!-- 班级 -->
                <div class="form-group  form-control-lg">
                  <label >班级</label>
                  <select class="form-control" name="clazz" id="clazz">
              	
                  </select>
                </div>
                <!-- 提交按钮 -->
                <button type="button" class="btn btn-success btn-block" id="btn1">创建</button>
              </form>
            </div>
          </div>
        </div>

        <!-- 右侧 -->
        <div class="col-lg-9">
          <!-- 显示数据的表格 -->
          <table class="table table-bordered table-hover mb-5"  >
            <!-- 表头 -->
            <thead class="thead-light">
              <tr>
                <th scope="col">编号</th>
                <th scope="col">姓名</th>
                <th scope="col">手机号</th>
                <th scope="col">班级</th>
                <th scope="col" class="w-25">操作</th>
              </tr>
            </thead>
            <tbody id="tab2" >
           
              
              <!-- 数据行结束 -->
            </tbody>
          </table>

        </div>
      </div>
    </div>

    <!-- 页脚 -->
    <div class="jumbotron jumbotron-fluid mb-0 fixed-bottom p-3">
      <p class="text-center">copyright@2018 牛耳教育</p>
    </div>

  </body>
</html>