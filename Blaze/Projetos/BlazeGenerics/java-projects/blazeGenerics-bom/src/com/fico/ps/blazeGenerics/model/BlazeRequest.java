package com.fico.ps.blazeGenerics.model;

import java.io.Serializable;

import com.fico.ps.blazeGenerics.model.input.Input;
import com.fico.ps.blazeGenerics.model.util.BlazeJavaBean;

public class BlazeRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	private Input input = new Input();
	
	
	public BlazeRequest() {
		
	}
	
	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return BlazeJavaBean.getXmlString(this);
	}

}
