//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.04 at 04:08:16 PM BRT 
//


package com.fico.ps.lac.blaze.generic.bom.output;

import java.io.Serializable;
import java.util.Date;

import com.fico.ps.lac.blaze.generic.bom.domain.GenericVarType;



public class GenericVar implements Serializable{
	
	private static final long serialVersionUID = 1L;
    
    protected String name;
    protected String scope;
    
    protected GenericVarType type;
    protected String stringVal;
    protected Boolean booleanVal;
    protected Double doubleVal; 
    protected Integer integerVal;
    protected Date dateVal;

    
    
    
	public GenericVar() {
		super();
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public GenericVarType getType() {
		return type;
	}



	public void setType(GenericVarType type) {
		this.type = type;
	}



	public String getStringVal() {
		return stringVal;
	}



	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}



	public Boolean getBooleanVal() {
		return booleanVal;
	}



	public void setBooleanVal(Boolean booleanVal) {
		this.booleanVal = booleanVal;
	}



	public Double getDoubleVal() {
		return doubleVal;
	}



	public void setDoubleVal(Double doubleVal) {
		this.doubleVal = doubleVal;
	}



	public Integer getIntegerVal() {
		return integerVal;
	}



	public void setIntegerVal(Integer integerVal) {
		this.integerVal = integerVal;
	}



	public Date getDateVal() {
		return dateVal;
	}



	public void setDateVal(Date dateVal) {
		this.dateVal = dateVal;
	}



	public String getScope() {
		return scope;
	}



	public void setScope(String scope) {
		this.scope = scope;
	}

}
