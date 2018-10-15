package com.newer.dao;

import com.newer.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author shining
 */
@Repository
public interface UserMapper {

    @Select("select * from userinfo where username=#{username} and userpwd=#{userpwd}")
    User findByParam(@Param("username") String username, @Param("userpwd") String userpwd);

    @Select("select * from userinfo where username=#{username}")
    User findName(@Param("username") String username);

    @Insert("insert into userinfo values(null,#{userName},#{userPwd},#{userSex},#{userEmail})")
    int addUser(User user);

}
