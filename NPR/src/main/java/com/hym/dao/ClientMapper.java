package com.hym.dao;

import com.hym.pojo.Client;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMapper {
//    @Results(value= {@Result(id=true,property="clientid",column="clientid"),
//            @Result(property="clientname",column="clientname")})
    @Select("select * from client where clientid=#{clientid}")
    Client findById(@Param("clientid") int clientid);
}