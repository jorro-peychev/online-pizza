package com.example.demo.controller.rest.permissions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.security.access.prepost.PreAuthorize;

@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasPermission('','{R}')")
public @interface CreatePizzaPermissions {
}
