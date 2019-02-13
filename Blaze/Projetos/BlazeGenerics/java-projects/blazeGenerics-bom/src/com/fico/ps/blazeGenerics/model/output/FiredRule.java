package com.fico.ps.blazeGenerics.model.output;

import java.io.Serializable;

public class FiredRule implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String ruleName;
	
	protected String ruleMessage;
	
	public String getRuleName() {
		return ruleName;
	}
	
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	public String getRuleMessage() {
		return ruleMessage;
	}
	
	public void setRuleMessage(String ruleMessage) {
		this.ruleMessage = ruleMessage;
	}
}
