package com.fico.ps.blazeGenerics.model.input;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import com.fico.ps.blazeGenerics.model.output.Output;

public class Input implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Object> listaEntradaSimples = new HashMap<String, Object>();
	
	private HashMap<String, LinkedList<HashMap<String, Object>>> listaEntradaComplexa = new HashMap<String, LinkedList<HashMap<String, Object>>>();	
	
	private Output output = new Output();
	
	public HashMap<String, Object> getListaVariaveisSimples() {
		return listaEntradaSimples;
	}
	public void setListaVariaveisSimples(HashMap<String, Object> listaVariaveisSimples) {
		this.listaEntradaSimples = listaVariaveisSimples;
	}
	public HashMap<String, LinkedList<HashMap<String, Object>>> getListaVariaveisComplexa() {
		return listaEntradaComplexa;
	}
	public void setListaVariaveisComplexa(HashMap<String, LinkedList<HashMap<String, Object>>> listaVariaveisComplexa) {
		this.listaEntradaComplexa = listaVariaveisComplexa;
	}
	public Output getOutput() {
		return output;
	}
	public void setOutput(Output output) {
		this.output = output;
	}
	public Input(){
		
	}
}
