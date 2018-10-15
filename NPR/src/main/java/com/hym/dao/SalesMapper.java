package com.hym.dao;

import com.hym.pojo.Sales;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesMapper {
    @Results(value= {@Result(id=true,property="salesid",column="salesid"),
            @Result(property="clientsid",column="clientsid",javaType=com.hym.pojo.Client.class,
            one =@One(select="com.hym.dao.ClientMapper.findById") ),
            @Result(property="carinfoid",column="carinfoid",javaType=com.hym.pojo.Carinfo.class,
                    one =@One(select="com.hym.dao.CarinfoMapper.findById") ),
            @Result(property="variable",column="variable",javaType=com.hym.pojo.Customerorders.class,
                    one =@One(select="com.hym.dao.CustomerordersMapper.findById") ),
            @Result(property="payment",column="payment",javaType=com.hym.pojo.Customerorders.class,
                    one =@One(select="com.hym.dao.CustomerordersMapper.findById") ),
            @Result(property="getdate",column="getdate",javaType=com.hym.pojo.Outstorage.class,
                    one =@One(select="com.hym.dao.OutstorageMapper.findById") ),
            @Result(property="userid",column="userid",
                    javaType=com.hym.pojo.Users.class,
                    one=@One(select="com.hym.dao.UsersMapper.findById"))})
    @Select("select * from sales")
    List<Sales> findAll();
}