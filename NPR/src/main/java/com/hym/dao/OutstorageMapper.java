package com.hym.dao;

import com.hym.pojo.Outstorage;
import org.apache.ibatis.annotations.*;

public interface OutstorageMapper {
    @Select("select * from outstorage where outstorageID=#{outstorageID}")
    Outstorage findById(@Param("outstorageID") int outstorageID);

    @Insert("insert into outstorage(outstorageID,carid,outtime,outquantity,vin,worker,remark) values(null,#{carid},#{outtime},#{outquantity},#{vin},#{worker},#{remark})")
    int addOutstorage(Outstorage outs);

}