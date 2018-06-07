package com.iTechies.model;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iTechies.qbuz.controller.UserController;

public class PersistanceEntity {

	private static final String ANNOYNOUS_USER = "annonymous_user";
	
	private static final Logger logger = LoggerFactory.getLogger(PersistanceEntity.class);
	
	@PrePersist
	public void prePersist(Object entity){		
		if( entity instanceof BaseEntity ){			
			BaseEntity baseEntity = (BaseEntity) entity;
			
			baseEntity.setCreatedBy(ANNOYNOUS_USER);
			baseEntity.setCreatedOn(new Date());
			baseEntity.setLastUpdatedBy(null);
			baseEntity.setLastUpdatedOn(null);			
		} else {
			logger.error("Mismatched object to be persisted error occured");
		}		
	}
	
	@PreUpdate
	public void preUpdate(Object entity){
		if( entity instanceof BaseEntity ){			
			BaseEntity baseEntity = (BaseEntity) entity;
			
			baseEntity.setCreatedBy(ANNOYNOUS_USER);			
			baseEntity.setLastUpdatedBy(ANNOYNOUS_USER);
			baseEntity.setLastUpdatedOn(new Date());			
		} else {
			logger.error("Mismatched object to be persisted error occured");
		}	
	}
	
}
