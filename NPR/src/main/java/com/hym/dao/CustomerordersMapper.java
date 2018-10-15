package com.hym.dao;

import com.hym.pojo.Carinfo;
import com.hym.pojo.Customerorders;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerordersMapper {
//    @Results(value= {@Result(id=true,property="customerordid",column="customerordid"),
//            @Result(property="remarks",column="remarks"),
//            @Result(property="zhifu",column="zhifu")
//             })
    @Select("select * from customerorders where customerordid=#{customerordid}")
    Customerorders findById(@Param("customerordid") int customerordid);
}