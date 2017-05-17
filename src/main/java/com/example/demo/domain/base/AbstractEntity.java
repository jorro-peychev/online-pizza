package com.example.demo.domain.base;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.hateoas.Identifiable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public abstract class AbstractEntity extends AbstractBean implements Identifiable<Long>, Serializable {
	
	private static final long serialVersionUID = 6302095480817297732L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	//@JsonIgnore
	protected Long id;

	// This flag could be used when we need to hide some rows from user 
	@JsonIgnore
	@Enumerated(EnumType.ORDINAL)
	protected EntityState elementState;
    
	@JsonIgnore
    @Column(nullable = false)
	protected String createdBy;
    
	@JsonIgnore
    @Column(nullable = false)
    protected Date createdDate;
    
	@JsonIgnore
    @Column(nullable = false)
    protected String updatedBy;
    
	@JsonIgnore
    @Column(nullable = false)
    protected Date updatedDate;
    
	@Version
	@Column(nullable = false)
	private Long version;

	@Override
	public Long getId() {
		return id;
	}
		
    public EntityState getElementState() {
		return elementState;
	}

	public void setElementState(EntityState elementState) {
		this.elementState = elementState;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
    public boolean equals(Object other) {
		if (this == other) return true;
        if ( !(other instanceof AbstractEntity) ) return false;

        final AbstractEntity entity = (AbstractEntity) other;
        if ( !entity.getId().equals( getId() ) ) return false;

        return true;
    }
	
	
}
