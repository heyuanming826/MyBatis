$(function () {
	//查询所有班级
	loadClazz();
	//查询所有学生
	loadStudent();
	
	//插入单个学生
	$("#btn1").click(function(){
		var name=$.trim($("#name").val());
		var phone=$.trim($("#phone").val());
		var clazzid=$.trim($("#clazzid").val());
		if(!name){
			alert("请输入学生姓名！");
			return;
		}
		
		$.ajax({
			url:"addStudent",
            type:"POST",
			dataType:"json",
			data:{name:name,phone:phone,clazzid:clazzid},
			success:function(data){
				if(data=1){
					alert("添加成功！");
					$("#name").val("");
					$("#phone").val("");
					loadStudent();
				}else{
					alert("添加失败！");
				}
				
			}
		});
		
		
		
	})
});

//查询所有班级
function loadClazz(){
	
	$.ajax({
		url:"clazzs",
		dataType:"json",
		success:function(data){
			$.each(data,function(){
				var $op=$("<option value='"+this.clazzid+"'>"+this.title+"</option>")
				$("#clazzid").append($op);
			})
		}
	});
}
//查询所有学生
function loadStudent(){
	
	$("#tab1 tr:not(:first)").remove();
	$.ajax({
		url:"students",
		dataType:"json",
		success:function(data){
			$.each(data,function(){
				var $td=$("<tr><td>"+this.stuid+"</td><td>"+this.name+"</td><td>"+this.phone+"</td><td>"+this.clazz.title+
						"</td><td><button type='button' onclick='deleti("
						+this.stuid+")' class='btn btn-danger btn-block'>删除</button></td></tr>")
				
				$("#tab1").append($td);
			})
		}
	});
}

//删除单个学生
function deleti(stuid){
	if (confirm("确定删除该学生?")) {
	$.ajax({
		url:"student/"+stuid,
		type:"DELETE",
		dataType:"json",
		success:function(data){
			if(data=1){
				alert("删除成功！");
				
				loadStudent();
			}else{
				alert("删除失败！");
			}
			
		}
	});
	}
}
