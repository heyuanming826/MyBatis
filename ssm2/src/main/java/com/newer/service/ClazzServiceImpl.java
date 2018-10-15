package com.newer.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.newer.pojo.Clazz;
import com.newer.dao.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shining
 *
 */
@Service("clazzService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ClazzServiceImpl implements ClazzService{

	@Autowired
	private ClazzMapper clazzMapper;
	
	
	@Override
	public List<Clazz> findAll() {
		return clazzMapper.findAll();
	}


	@Override
	public Clazz findById(int auid) {
		return clazzMapper.findById(auid);
	}
	
	

}
