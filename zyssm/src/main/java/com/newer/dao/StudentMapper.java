package com.newer.dao;

import java.util.List;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentMapper {

	//添加
	@Insert("insert into student values(null,#{name},#{phone},#{clazz.id})")
	int addStudent1(Student student);
	
	//删除
	@Delete("delete from student where id=#{id}")
	int deleteStudent(@Param("id") int id);
	
	
	//查所有
	@ResultMap(value="com.newer.dao.StudentMapper.student1")
	@Select("select s.id as sid,s.name as sname,s.phone,s.clazz_id,c.id as cid,c.name as cname from student s left join clazz c on s.clazz_id=c.id")
	List<Student> findAll();
	
}
