package com.fico.ps.blazeGenerics.model.output;

import java.io.Serializable;
import java.util.Date;

import com.fico.ps.blazeGenerics.model.util.GenericVarType;


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
