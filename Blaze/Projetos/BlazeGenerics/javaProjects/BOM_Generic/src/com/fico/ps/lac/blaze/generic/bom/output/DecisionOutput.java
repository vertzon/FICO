package com.fico.ps.lac.blaze.generic.bom.output;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DecisionOutput implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
    protected List<FiredRule> firedRules = new LinkedList<FiredRule>();
    protected List<AuditStep> auditedSteps = new LinkedList<AuditStep>();
    protected List<GenericVar> calculatedVars = new LinkedList<GenericVar>();
    
    
    private HashMap<String, Object> USER_OUTPUT_VARS_GENERIC = new HashMap<String, Object>(); 
    
    
    private String decision = ""; 
    
    
	public List<FiredRule> getFiredRules() {
		return firedRules;
	}
	public void setFiredRules(List<FiredRule> firedRules) {
		this.firedRules = firedRules;
	}
	public List<AuditStep> getAuditedSteps() {
		return auditedSteps;
	}
	public void setAuditedSteps(List<AuditStep> auditedSteps) {
		this.auditedSteps = auditedSteps;
	}
	public List<GenericVar> getCalculatedVars() {
		return calculatedVars;
	}
	public void setCalculatedVars(List<GenericVar> calculatedVars) {
		this.calculatedVars = calculatedVars;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public HashMap<String, Object> getUSER_OUTPUT_VARS_GENERIC() {
		return USER_OUTPUT_VARS_GENERIC;
	}
	public void setUSER_OUTPUT_VARS_GENERIC(HashMap<String, Object> uSER_OUTPUT_VARS_GENERIC) {
		USER_OUTPUT_VARS_GENERIC = uSER_OUTPUT_VARS_GENERIC;
	}

}
