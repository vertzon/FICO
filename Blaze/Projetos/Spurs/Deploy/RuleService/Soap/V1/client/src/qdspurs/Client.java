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

package qdspurs;

import java.util.*;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import qdspurs.clientstub.*;

//==> Import Application specific code here
/**
 * This class implements the WebService client for the WebServiceRulesService.
 *	Note that this is simply a client example.
 *	<p>
 */
public class Client implements Runnable
{

	private SpursService _service = null;
	private Spurs _port;
	
		
	/**
	 * Connect to the web service
	 */
	public void connect()
			throws java.lang.Exception
	{
		_service = new SpursService();
		_port = _service.getSpursPort();
		
		// Following code plugins SOAP message context handler
		// that can be used to examine the actual SOAP message request
		// and response exchanged between the client and the web service.
		//
		// Uncomment out following lines if needed for debugging
		//
		//Binding binding = ((BindingProvider)_port).getBinding();
		//List<Handler> handlerList = binding.getHandlerChain();
		//handlerList.add(new qdspurs.Handler());
		//binding.setHandlerChain(handlerList);
	}
	
	public BlazePayload calculaContrato(BlazePayload arg0)
		throws java.lang.Exception
	{
		BlazePayload retVal = _port.calculaContrato(arg0);
		return retVal;
	}
	private BlazePayload _calculaContrato()
			throws java.lang.Exception
	{
		//==> Set up the invocation arguments.
		//==>	BlazePayload arg0 = (value for arg0);
		//==> Invoke the actual method. Replace the next line with:
		//==>	return calculaContrato(arg0);
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
			BlazePayload retValcalculaContrato = _calculaContrato();
		}
		catch (java.lang.Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
