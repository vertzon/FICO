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

//==> Import Application specific code here

/**
 *	This class provide main method to instantiate a Client
 *  that will invoke the web service.
 *
 */
public class Runner
{

	/**
	 *	Constructor for an example runner
	 */
	Runner()
	{
	}

	/**
	 *	Runs the example. This method:
	 *	<ul>
	 *	<li>Creates a local deployment manager, if required.
	 *	<li>Creates an instance of the server.
	 *	<li>Creates an instance of an example client for the server
	 *	<li>Invokes each entry point in the client
	 *	<li>Shuts down the server
	 *	<li>Shuts down the deployment manager, if required.
	 *	</ul>
	 */
	public void runExample()
	{
		try {

			// Create the client
			Client client = new Client();

			// Create connection to web service
			client.connect();

			// Run the client
			client.run();


		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.exit(-1);
		}

	}

	/**
	 *	Main method. triggers the Example runner's runExample
	 */
	public static void main(String[] args)
	{
		new Runner().runExample();
	}

}
