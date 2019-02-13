package com.fico.ps.blazeGenerics.model;

import java.io.Serializable;

import com.fico.ps.blazeGenerics.model.output.Output;
import com.fico.ps.blazeGenerics.model.util.BlazeJavaBean;

public class BlazeResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Output output = new Output();
	
	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}
	
	public BlazeResponse() {
		
	}
	
	@Override
	public String toString() {
		return BlazeJavaBean.getXmlString(this);
	}

}
