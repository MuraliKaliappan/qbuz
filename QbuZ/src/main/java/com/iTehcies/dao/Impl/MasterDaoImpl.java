package com.iTehcies.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import com.iTechies.model.BaseEntity;
import com.iTehcies.dao.MasterDao;



@Transactional
public class MasterDaoImpl<E extends BaseEntity> implements MasterDao<E> {
	
	@PersistenceContext
	EntityManager EntityManager;


	@Override	
	public void persist(E persistEntity) {
		if(persistEntity != null){
			EntityManager.persist(persistEntity);
		}
			
	}

}
