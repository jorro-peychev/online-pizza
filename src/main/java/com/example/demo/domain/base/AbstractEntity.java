package com.example.demo.domain.base;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> extends AbstractPersistable<Long>/* implements Identifiable<Long>*/ {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	// This flag could be used when we need to hide some rows from user
	@JsonIgnore
	@Enumerated(EnumType.ORDINAL)
	protected EntityState elementState;

	@ReadOnlyProperty
	@JsonIgnore
	@Column(nullable = false, length = 20)
	protected String createdBy;

	@ReadOnlyProperty
	@JsonIgnore
	@Column(nullable = false)
	protected Date createdDate;

	@JsonIgnore
	@Column(nullable = false)
	protected String updatedBy;

	@JsonIgnore
	@Column(nullable = false, length = 20)
	protected LocalDateTime updatedDate;

	@Version
	@Column(nullable = false)
	private Long version;

		
	@Override
	public void setId(Long id) {
		super.setId(id);
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

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@PrePersist
	public void prePersist() {
		this.updatedDate = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
				// important to not log passwords
				.setExcludeFieldNames("password", "newPassword", "currentPassword", "oldPassword", "access_token",
						"accessToken")
				.build();
	}

//	@Override
//	public boolean equals(Object other) {
//		if (this == other) {
//			return true;
//		}
//		if (!(other instanceof AbstractEntity)) {
//			return false;
//		}
//		final AbstractEntity entity = (AbstractEntity) other;
//		if (!entity.getId().equals(getId())) {
//			return false;
//		}
//		return true;
//	}
	
	@Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
