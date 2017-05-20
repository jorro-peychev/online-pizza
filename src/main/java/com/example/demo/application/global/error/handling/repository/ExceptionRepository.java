package com.example.demo.application.global.error.handling.repository;

import org.springframework.data.repository.Repository;

import com.example.demo.application.global.error.handling.beans.ErrorMessage;
import com.example.demo.domain.Pizza;

public interface ExceptionRepository  extends Repository<ErrorMessage, Long> {

	//String logError(ErrorMessage sf, StackTraceElement[] stack);

}
