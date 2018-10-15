package com.hym.controller;

import com.newer.pojo.Clazz;
import com.newer.pojo.Student;
import com.newer.service.StudentService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentServlet{
	@Autowired
	private StudentService studentService;
	@ResponseBody
	@RequestMapping(value = "/studs",method = RequestMethod.GET)
	public List<Student> findAll(){
		return studentService.findAll();
	}

    @ResponseBody
    @RequestMapping(value = "/tj/{name},{phone},{clazz}",method = RequestMethod.POST)
	public int add(@PathVariable("name") String name,
                      @PathVariable("phone") String phone,
                      @PathVariable("clazz") String clazz
					  ){
		Student student=new Student();
		Clazz clazz1=new Clazz();
		int cla=Integer.parseInt(clazz);
		clazz1.setId(cla);
		student.setClazz(clazz1);
		student.setName(name);
		student.setPhone(phone);

	return studentService.addStudent1(student);
	}

	@ResponseBody
	@RequestMapping(value = "/sc/{id}",method = RequestMethod.DELETE)
	public int delet(@PathVariable("id") int id){
		return studentService.deleteStudent(id);
	}
}
