package com.example.demo.application.global.error.handling;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.util.Assert;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.application.global.error.handling.beans.ErrorMessage;
import com.example.demo.application.global.error.handling.exceptions.InvalidCredentialsException;
import com.example.demo.application.global.error.handling.exceptions.ResourceForbidden;
import com.example.demo.application.global.error.handling.exceptions.ValidationException;
import com.example.demo.application.global.error.handling.service.ErrorService;

//@ControllerAdvice
public class GlobalExceptionHandler {
/*	
	private Logger log = LogManager.getLogger(getClass());

	private final ResourceBundleMessageSource messageSource;
	private final ErrorService errorService;

	@Autowired
	public GlobalExceptionHandler(ResourceBundleMessageSource messageSource, ErrorService errorService) {
		Assert.notNull(messageSource);
		this.messageSource = messageSource;

		Assert.notNull(errorService);
		this.errorService = errorService;
	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND) // 404
	public ErrorMessage handleConflict(EmptyResultDataAccessException e) {
		log.info("Info: ", e);
		return errorService.logError(new ErrorMessage(HttpStatus.NOT_FOUND.toString(), e.getMessage()),
				e.getStackTrace());
	}

	@ExceptionHandler(CannotAcquireLockException.class)
	@ResponseStatus(HttpStatus.LOCKED) // 423
	public ErrorMessage handleConflict(CannotAcquireLockException e) {
		log.info("Info:", e);
		return errorService.logError(new ErrorMessage(HttpStatus.LOCKED.toString(), e.getMessage()),
				e.getStackTrace());
	}

	@ExceptionHandler(InvalidCredentialsException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED) // 401
	@ResponseBody
	public ErrorMessage handleConflict(InvalidCredentialsException e) {
		log.error(e.getMessage(), e);
		return errorService.logError(new ErrorMessage(e.getMessage(), ""), e.getStackTrace());
	}

	@ExceptionHandler({ AccessDeniedException.class, ResourceForbidden.class })
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ResponseBody
	public ErrorMessage handleConflict(AccessDeniedException e) {
		log.error(e.getMessage(), e);
		return errorService.logError(new ErrorMessage("forbidden", "Not enough privileges"),
				e.getStackTrace());
	}

	@ExceptionHandler({ MethodArgumentNotValidException.class, UnsatisfiedServletRequestParameterException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	@ResponseBody
	public ErrorMessage handleConflict(MethodArgumentNotValidException e) {
		log.error(e.getMessage(), e);
		
		return errorService.logError(null, e.getStackTrace());
	}

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	@ResponseBody
	public ErrorMessage handleConflict(ConstraintViolationException error) {
		
		return errorService.logError( new ErrorMessage(error.getMessage(), ""), error.getStackTrace());
	}

	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	@ResponseBody
	public ErrorMessage handleConflict(ValidationException e) {
		log.error(e.getMessage(), e);
		return errorService.logError( new ErrorMessage(e.getMessage(), ""), e.getStackTrace());
	}


	@ExceptionHandler(UncategorizedSQLException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ResponseBody
	public ErrorMessage handleUncaughtException(UncategorizedSQLException e) throws IOException {
		log.error("Error: ", e);
		int err = e.getSQLException().getErrorCode();

		String errMess = e.getMessage();

		String errCode = Integer.toString(err);
		return errorService.logError(new ErrorMessage(errCode, errMess), e.getStackTrace());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ResponseBody
	public ErrorMessage handleUncaughtException(Exception ex, WebRequest request, HttpServletResponse response)
			throws IOException {
		log.error("Error: ", ex);
		return errorService.logError(
				new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.toString(), ex.getMessage()), ex.getStackTrace());
	}
*/
}
