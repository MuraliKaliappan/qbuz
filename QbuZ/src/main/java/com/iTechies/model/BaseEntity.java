package com.iTechies.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(PersistanceEntity.class)
public class BaseEntity {

	@Id
	@GeneratedValue
	@Column(name="pkey")	
	private Integer pkey;
	
	@Column(name="created_on")
	private Date createdOn;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="last_updated_on")
	private Date lastUpdatedOn;
	
	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	@Column(name="deleted")
	private Boolean deleted = false;
	
	
	
	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Boolean getDeleted() {
		if(deleted == null){
			return false;
		}		
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	
	
	
}
