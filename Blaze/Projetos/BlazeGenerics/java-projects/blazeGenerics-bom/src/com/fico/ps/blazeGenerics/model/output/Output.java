package com.fico.ps.blazeGenerics.model.output;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Output implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected List<FiredRule> firedRules = new LinkedList<FiredRule>();
    protected List<AuditStep> auditedSteps = new LinkedList<AuditStep>();
    protected List<GenericVar> calculatedVars = new LinkedList<GenericVar>();
    
    
    private HashMap<String, Object> listaSaidaSimples = new HashMap<String, Object>();
	
	private HashMap<String, LinkedList<HashMap<String, Object>>> listaSaidaComplexa = new HashMap<String, LinkedList<HashMap<String, Object>>>();	
    
    
    private String decision = new String();


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


	public HashMap<String, Object> getListaSaidaSimples() {
		return listaSaidaSimples;
	}


	public void setListaSaidaSimples(HashMap<String, Object> listaSaidaSimples) {
		this.listaSaidaSimples = listaSaidaSimples;
	}


	public HashMap<String, LinkedList<HashMap<String, Object>>> getListaSaidaComplexa() {
		return listaSaidaComplexa;
	}


	public void setListaSaidaComplexa(HashMap<String, LinkedList<HashMap<String, Object>>> listaSaidaComplexa) {
		this.listaSaidaComplexa = listaSaidaComplexa;
	}


	public String getDecision() {
		return decision;
	}


	public void setDecision(String decision) {
		this.decision = decision;
	}
    
}
