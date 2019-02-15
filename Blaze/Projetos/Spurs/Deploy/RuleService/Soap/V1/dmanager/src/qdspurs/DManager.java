//
// Blaze Advisor Server Deployment.
// Created by the Blaze Advisor Generate Deployment Wizard
//

// This material is the confidential, unpublished property of 
// Fair Isaac Corporation. Receipt or possession of this material does not 
// convey rights to divulge, reproduce, use, or allow others to use it 
// without the specific written authorization of Fair Isaac Corporation and 
// use must conform strictly to the license agreement.
//
// Copyright (c) 2000-2018 Fair Isaac Corporation. All Rights Reserved.
// 
//

package qdspurs;

import java.io.IOException;

import com.blazesoft.server.deploy.manager.NdDeploymentManager;
import com.blazesoft.server.deploy.manager.NdDeploymentManagerException;

//==> Import Application specific code here

/** 
 *	This class simply starts up the Deployment manager which can be used either 
 *	to start a local or remote deployment manager.
 */
public class DManager	
{
	// Reference to the deployment manager
	private NdDeploymentManager _dManager;

	/** 
	 *	Constructs a deployment manager out of the specified
	 *	configuration.
	 *
	 *	@param	dManagerConfig	The name of the configuration file used to 
	 *							configure the deployment manager. If null, a 
	 *							default will be used
	 */
	public DManager(String dManagerConfig)
		throws NdDeploymentManagerException
	{
		_dManager = NdDeploymentManager.createDeploymentManager(dManagerConfig != null ? 
																	dManagerConfig : 
																	"./dmanager/SpursServer.dmanager");
	}

	/**
	 * Stops the deployment manager
	 */
	public void shutdown()
		throws NdDeploymentManagerException
	{
		_dManager.shutdown();
	}

	/**
	 *	Creates and starts the deployment manager. Used when servers connect to 
	 *	it remotely.
	 *	It is expected that this class is invoked with, in the command line, the
	 *	path to an accessible deployment manager configuration file.
	 */
	public static void main(String[] args)
	{
		String dManagerConfig = null;
		dManagerConfig = (((args != null) && (args.length > 0)) ? args[0] : null);

		try{
			DManager dm = new DManager(dManagerConfig);
			System.out.println("Press Enter to shut down the Deployment Manager");
			System.in.read();
			dm.shutdown();
			System.out.println("It is now safe to close this command window");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		catch (NdDeploymentManagerException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
