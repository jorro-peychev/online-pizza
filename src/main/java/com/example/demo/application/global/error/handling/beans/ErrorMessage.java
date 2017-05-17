package com.example.demo.application.global.error.handling.beans;

import javax.persistence.Entity;

@Entity
public class ErrorMessage {
	private String incidentId;
	private String faultCode;
	private String faultMessage;

	public ErrorMessage() {

	}

	public ErrorMessage(String faultCode, String message) {
		this(faultCode, message, null);
	}

	public ErrorMessage(String faultCode, String message, String incidentId) {
		this.faultCode = faultCode;
		this.faultMessage = message;
		this.incidentId = incidentId;
	}

	public String getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultMessage() {
		return faultMessage;
	}

	public void setFaultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
	}
}