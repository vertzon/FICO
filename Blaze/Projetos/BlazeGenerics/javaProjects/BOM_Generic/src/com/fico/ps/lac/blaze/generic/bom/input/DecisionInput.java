package com.fico.ps.lac.blaze.generic.bom.input;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import com.fico.ps.lac.blaze.generic.bom.output.DecisionOutput;

public class DecisionInput implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Generic Variables
	private HashMap<String, Object> USER_SEGMENT_VARS_GENERIC = new HashMap<String, Object>(); 
	
	// Generic Lists
	private HashMap<String, LinkedList<HashMap<String, Object>>> USER_SEGMENT_LISTS_GENERIC = new HashMap<String, LinkedList<HashMap<String, Object>>>();
	
	// Outputs
	private DecisionOutput output = new DecisionOutput();
	
	
	
	

	public HashMap<String, Object> getUSER_SEGMENT_VARS_GENERIC() {
		return USER_SEGMENT_VARS_GENERIC;
	}

	public void setUSER_SEGMENT_VARS_GENERIC(HashMap<String, Object> uSER_SEGMENT_VARS_GENERIC) {
		USER_SEGMENT_VARS_GENERIC = uSER_SEGMENT_VARS_GENERIC;
	}

	public HashMap<String, LinkedList<HashMap<String, Object>>> getUSER_SEGMENT_LISTS_GENERIC() {
		return USER_SEGMENT_LISTS_GENERIC;
	}

	public void setUSER_SEGMENT_LISTS_GENERIC(
			HashMap<String, LinkedList<HashMap<String, Object>>> uSER_SEGMENT_LISTS_GENERIC) {
		USER_SEGMENT_LISTS_GENERIC = uSER_SEGMENT_LISTS_GENERIC;
	}

	public DecisionOutput getOutput() {
		return output;
	}

	public void setOutput(DecisionOutput output) {
		this.output = output;
	}


}
