package com.fico.ps.blazeGenerics.model.output;

import java.io.Serializable;

import com.fico.ps.blazeGenerics.model.util.AuditStepScope;

public class AuditStep implements Serializable{

	private static final long serialVersionUID = 1L;
	
 protected String stepName;
 protected AuditStepScope scope;
 protected String stepMessage;
 protected Integer stepNumber;

	public AuditStep() {
		super();
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public AuditStepScope getScope() {
		return scope;
	}



	public void setScope(AuditStepScope scope) {
		this.scope = scope;
	}



	public String getStepMessage() {
		return stepMessage;
	}



	public void setStepMessage(String stepMessage) {
		this.stepMessage = stepMessage;
	}



	public Integer getStepNumber() {
		return stepNumber;
	}



	public void setStepNumber(Integer stepNumber) {
		this.stepNumber = stepNumber;
	}



}
