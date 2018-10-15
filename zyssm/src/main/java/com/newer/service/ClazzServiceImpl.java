package com.newer.service;

import java.util.List;

import com.newer.dao.ClazzMapper;
import com.newer.pojo.Clazz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("ClazzService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ClazzServiceImpl implements ClazzService{
	@Autowired
	private ClazzMapper clazzMapper;
	@Override
	public List<Clazz> findAll() {
		return clazzMapper.findAll();
	}

}
