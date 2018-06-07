package com.iTehcies.dao;

import com.iTechies.model.BaseEntity;


public interface MasterDao<E extends BaseEntity> {
	
	public void persist(E persistEntity);
	
}
