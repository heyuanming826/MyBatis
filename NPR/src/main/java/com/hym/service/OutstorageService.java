package com.hym.service;

import com.hym.pojo.Outstorage;
import org.apache.ibatis.annotations.Param;

public interface OutstorageService {
    Outstorage findById(@Param("outstorageID") int outstorageID);
    int addOutstorage(Outstorage outs);
}
