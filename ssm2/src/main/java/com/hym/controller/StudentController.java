package com.hym.controller;

import com.newer.pojo.Student;
import com.newer.service.ClazzService;
import com.newer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClazzService clazzService;

    @ResponseBody
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> findAll() {

       return studentService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/student/{stuid}",method = RequestMethod.DELETE)
    public int deleteBook(@PathVariable("stuid") int stuid){
        return studentService.deleteStudent(stuid);
    }

    @ResponseBody
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public int addStudent(@RequestParam("name") String name,
                          @RequestParam("phone") String phone,
                          @RequestParam("clazzid") int clazzid){
        System.out.println(name);
        Student student=new Student();
        student.setName(name);
        student.setPhone(phone);
        student.setClazz( clazzService.findById(clazzid));
        System.out.println(student.getClazz().getTitle());
        return studentService.addStudent(student);
    }
}
