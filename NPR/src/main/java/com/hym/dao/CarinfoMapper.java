package com.hym.dao;

import com.hym.pojo.Carinfo;
import com.hym.pojo.Client;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CarinfoMapper {
//    @Results(value= {@Result(id=true,property="carinfoid",column="carinfoid"),
//            @Result(property="cartype",column="cartype")})
    @Select("select * from carinfo where carinfoid=#{carinfoid}")
    Carinfo findById(@Param("carinfoid") int carinfoid);
}