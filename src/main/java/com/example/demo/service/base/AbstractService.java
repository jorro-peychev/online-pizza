package com.example.demo.service.base;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.base.AbstractEntity;

public abstract class AbstractService<T extends AbstractEntity<ID>, ID extends Serializable> {
	//private final Logger LOGGER = LoggerFactory.getLogger(AbstractService.getClass());
	private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(AbstractService.class);

	@Autowired
	protected CrudRepository<T, ID> genericRepository;

	public T findOne(ID id) {
		this.LOGGER.debug(String.format("Requesting record id: [%s].", id));
		return this.genericRepository.findOne(id);
	}

	public List<T> findAll() {
		this.LOGGER.debug("Requesting all records.");
		return (List<T>) this.genericRepository.findAll();
	}

	public T insert(T entityObject) {
		this.LOGGER.debug(String.format("Saving the entity [%s].", entityObject));
		entityObject.setId(null);
		return this.genericRepository.save(entityObject);
	}

	public T update(T entityObject) {
		this.LOGGER.debug(String.format("Request to update the record [%s].", entityObject));

		if (entityObject == null) {
			this.LOGGER.error("Entity can not be null.");
			return null;
		}
		if (entityObject.getId() == null) {
			this.LOGGER.error("ID can not be null.");
			return null;
		}
		return this.genericRepository.save(entityObject);
	}

//	public void delete(T entityObject) {
//		this.LOGGER.debug(String.format("Request to delete the record [%s].", entityObject));
//		this.genericRepository.delete(entityObject.getId());
//	}

	public void delete(ID id) {
		this.LOGGER.debug(String.format("Request to delete the record [%s].", id));
		this.genericRepository.delete(id);
	}
}
