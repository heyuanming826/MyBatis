package com.hym.service;

import com.hym.dao.OutstorageMapper;
import com.hym.pojo.Outstorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("OutstorageService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class OutstorageServiceImpl implements OutstorageService {
    @Autowired
    private OutstorageMapper outstorageMapper;
    @Override
    public Outstorage findById(int outstorageID) {
        return outstorageMapper.findById(outstorageID);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addOutstorage(Outstorage outs) {
        return outstorageMapper.addOutstorage(outs);
    }
}
