package com.example.demo.application.permissions;

import java.io.Serializable;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

public class AccessPermissionEvaluator implements PermissionEvaluator {

	@Override
	public boolean hasPermission(Authentication arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPermission(Authentication arg0, Serializable arg1, String arg2, Object arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
