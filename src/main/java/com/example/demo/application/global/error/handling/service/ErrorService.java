package com.example.demo.application.global.error.handling.service;

import com.example.demo.application.global.error.handling.beans.ErrorMessage;

/**
 * Property of CODIX Bulgaria EAD
 * Created by vtodorov
 * Date:  25/01/2017 Time: 3:08 PM
 * Interface defining the contract for registering BE errors
 *
 * @author vtodorov
 */
public interface ErrorService
{
  ErrorMessage logError(ErrorMessage sf, StackTraceElement[] stack);
}

