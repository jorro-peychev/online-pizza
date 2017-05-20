package com.example.demo.application.global.error.handling.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.Assert;

import com.example.demo.application.global.error.handling.beans.ErrorMessage;
import com.example.demo.application.global.error.handling.repository.ExceptionRepository;
import com.example.demo.application.global.error.handling.service.ErrorService;

@Service("errorService")
public class ErrorServiceImpl implements ErrorService {
	
	private static final Logger log = LoggerFactory.getLogger(ErrorServiceImpl.class);

	private final ExceptionRepository errorRepo;
	private final TransactionTemplate transactionTemplate;

	@Autowired
	public ErrorServiceImpl(ExceptionRepository errorRepo, PlatformTransactionManager transactionManager) {
		Assert.notNull(errorRepo);
		this.errorRepo = errorRepo;

		Assert.notNull(transactionManager);
		transactionTemplate = new TransactionTemplate(transactionManager);
		transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
	}

	/**
	 * Register and assigns incident id for a fault
	 * 
	 * @param sf
	 *            the service fault, never {@code null}
	 * @return a service fault with incidend id
	 */
	@Override
	public ErrorMessage logError(ErrorMessage sf, StackTraceElement[] stack) {
		Assert.notNull(sf);
		return transactionTemplate.execute(new TransactionCallback<ErrorMessage>() {
			@Override
			public ErrorMessage doInTransaction(TransactionStatus status) {
				// sf.setIncidentId(errorRepo.logError(sf, stack));
				log.debug("ERROR");
				return sf;
			}
		});
	}

}
