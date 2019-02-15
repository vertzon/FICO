@REM
@REM Generated by the Advisor Quick Deployer 
@REM

@rem This material is the confidential, unpublished property of 
@rem Fair Isaac Corporation. Receipt or possession of this material does not 
@rem convey rights to divulge, reproduce, use, or allow others to use it 
@rem without the specific written authorization of Fair Isaac Corporation and 
@rem use must conform strictly to the license agreement.
@rem
@rem Copyright (c) 2013-2018 Fair Isaac Corporation. All Rights Reserved.
@REM 
@REM
@REM This script can be used to generate the client proxy for the deployed Web Service.
@REM
@REM

@REM 
@REM create build classes directory
@REM 
@if exist "build\classes" goto start
@mkdir build\classes

:start
@REM 
@REM generate web service proxy
@REM 
@set contextRoot=SpursServer
@set URLPattern=SpursService
@set package=qdspurs.clientstub 
@%JAVA_HOME%\bin\wsimport -d build\classes -s src -keep -p %package% http://localhost:8080/%contextRoot%/%URLPattern%?wsdl


