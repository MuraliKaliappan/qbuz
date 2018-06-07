package com.iTehcies.service.Impl;


import org.springframework.stereotype.Service;

import com.iTechies.model.BaseEntity;
import com.iTechies.model.Signup;
import com.iTehcies.dao.MasterDao;
import com.iTehcies.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private MasterDao<BaseEntity> masterDao;

	@Override
	public void addUser(Signup signUp) {
		if (signUp != null) {
			masterDao.persist(signUp);
		}

	}

	public void setMasterDao(MasterDao<BaseEntity> masterDao) {
		this.masterDao = masterDao;
	}

}
