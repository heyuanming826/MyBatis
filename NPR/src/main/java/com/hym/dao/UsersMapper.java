package com.hym.dao;

import com.hym.pojo.Customerorders;
import com.hym.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface UsersMapper {
    @Select("select * from users where username=#{username} and password=#{password} and department=#{department}")
    Users findByParam(@Param("username") String username, @Param("password") String password,@Param("department") String department);


    @Insert("insert into users(userid,username,password,department,job) values(null,#{username},#{password},#{department},#{job})")
    int addUser(Users user);

    @Update("update users set password=#{password} where username=#{username}")
    int updateUser(@Param("password") String password, @Param("username") String username);

    @Select("select * from users where userid=#{userid}")
    Users findById(@Param("userid") int userid);
}