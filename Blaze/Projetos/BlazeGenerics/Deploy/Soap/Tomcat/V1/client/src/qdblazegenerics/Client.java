//
// Advisor Server Deployment.
//

// This material is the confidential, unpublished property of 
// Fair Isaac Corporation. Receipt or possession of this material does not 
// convey rights to divulge, reproduce, use, or allow others to use it 
// without the specific written authorization of Fair Isaac Corporation and 
// use must conform strictly to the license agreement.
//
// Copyright (c) 2013-2018 Fair Isaac Corporation. All Rights Reserved.
// All Rights Reserved.
//

package qdblazegenerics;

import java.util.*;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import qdblazegenerics.clientstub.*;

//==> Import Application specific code here
/**
 * This class implements the WebService client for the WebServiceRulesService.
 *	Note that this is simply a client example.
 *	<p>
 */
public class Client implements Runnable
{

	private BlazeGenericsService _service = null;
	private BlazeGenerics _port;
	
		
	/**
	 * Connect to the web service
	 */
	public void connect()
			throws java.lang.Exception
	{
		_service = new BlazeGenericsService();
		_port = _service.getBlazeGenericsPort();
		
		// Following code plugins SOAP message context handler
		// that can be used to examine the actual SOAP message request
		// and response exchanged between the client and the web service.
		//
		// Uncomment out following lines if needed for debugging
		//
		//Binding binding = ((BindingProvider)_port).getBinding();
		//List<Handler> handlerList = binding.getHandlerChain();
		//handlerList.add(new qdblazegenerics.Handler());
		//binding.setHandlerChain(handlerList);
	}
	
	public DecisionInput processWithDecisionFlow(DecisionInput arg0)
		throws java.lang.Exception
	{
		DecisionInput retVal = _port.processWithDecisionFlow(arg0);
		return retVal;
	}
	public java.util.List<DecisionInput> processBatchWithDecisionFlow(java.util.List<DecisionInput> arg0)
		throws java.lang.Exception
	{
		java.util.List<DecisionInput> retVal = _port.processBatchWithDecisionFlow(arg0);
		return retVal;
	}
	private DecisionInput _processWithDecisionFlow()
			throws java.lang.Exception
	{
		//==> Set up the invocation arguments.
		//==>	DecisionInput arg0 = (value for arg0);
		//==> Invoke the actual method. Replace the next line with:
		//==>	return processWithDecisionFlow(arg0);
		return null;
	}
	private java.util.List<DecisionInput> _processBatchWithDecisionFlow()
			throws java.lang.Exception
	{
		//==> Set up the invocation arguments.
		//==>	java.util.List<DecisionInput> arg0 = (value for arg0);
		//==> Invoke the actual method. Replace the next line with:
		//==>	return processBatchWithDecisionFlow(arg0);
		return null;
	}
	/**
	 *	Implements the Runnable interface.
	 *	This implementation simply invokes the business invocation methods
	 */
	public void run()
	{
		try {
			// Invoke each entry point
			DecisionInput retValprocessWithDecisionFlow = _processWithDecisionFlow();
			java.util.List<DecisionInput> retValprocessBatchWithDecisionFlow = _processBatchWithDecisionFlow();
		}
		catch (java.lang.Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
