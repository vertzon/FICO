package com.fico.ps.blazeGenerics.model;

import java.io.Serializable;

import com.fico.ps.blazeGenerics.model.util.BlazeJavaBean;

public class BlazePayload implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private BlazeRequest request = new BlazeRequest();
	private BlazeResponse response = new BlazeResponse();
	
	public BlazeRequest getRequest() {
		return request;
	}


	public void setRequest(BlazeRequest request) {
		this.request = request;
	}


	public BlazeResponse getResponse() {
		return response;
	}


	public void setResponse(BlazeResponse response) {
		this.response = response;
	}


	public static BlazePayload createInstance()
	{
		return new BlazePayload();
	}
	
	
	public BlazePayload()
	{
		
	}
	
	@Override
	public String toString() {
		return BlazeJavaBean.getXmlString(this);
	}

}
