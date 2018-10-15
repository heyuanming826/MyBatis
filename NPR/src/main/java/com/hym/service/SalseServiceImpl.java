package com.hym.service;

import com.hym.dao.SalesMapper;
import com.hym.pojo.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SalseService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class SalseServiceImpl implements SalseService {
    @Autowired
    private SalesMapper salesMapper;

    @Override
    public List<Sales> findAll() {
        return salesMapper.findAll();
    }
}
