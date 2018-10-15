$(function(){
	//查询所有班级
	loadClazz();
	//查询所有
	loadStudent();
	//添加
	insertStudent();
	//删除
	deleteStudent(id);
});

//查询所有班级
function loadClazz(){

	$.ajax({
		url:"clazzs",
		dataType:"json",
		success:function(data){
			$.each(data,function(){
				var $op=$("<option  value='"+this.id+"'>"+this.name+"</option>")
				$("#clazz").append($op);
			})
		}
	});
}

//<button type='button' name='' id='bn2' >删除</button>
//查询所有
 function loadStudent(){
 	$.ajax({
		url:"studs",
 		dataType:"json",
		success:function(data){
 			$("#tab2 tr:not(:first)").remove()
 			$.each(data,function(){
 			var $tr=$("<tr id='id'><th >"+this.id+"</th><th>"+this.name+"</th><th>"+this.phone+"</th><th>"+this.clazz.name+"</th><th><a class='btn btn-danger btn-block' href='javascript:deleteStudent("+this.id+")'>删除</a></th></tr>")
 			$("#tab2").append($tr);
 			})
 		}
	});
 }

//添加
function insertStudent(){

	var name=$("#name").val();
	var phone=$("#phone").val();
	var clazz=$("#clazz").val();
	$("#btn1").click(function(){
		$.ajax({
		url:"tj",
            data:{name:name,phone:phone,clazz:clazz},
		dataType:"json",
		type:"POST",
		success:function(data){
			if(data.pass){
				alert("成功");
				loadStudent();
			}else{
				alert(data.msg);
			}
		}
	});
	})
}

//删除
function deleteStudent(id){
//	$("#bn2").click(function(){
	if(confirm("确定要删除该员工吗?")){
		$.ajax({
		url:"sc"+id,
            type:"DELETE",
            dataType:"json",
		success:function(data){
			alert(data)
			if(data>0){
				alert("删除成功");
				loadStudent();
			}else{
				alert("失败");
			}
		}
	});
//	})
	}
	
 }

