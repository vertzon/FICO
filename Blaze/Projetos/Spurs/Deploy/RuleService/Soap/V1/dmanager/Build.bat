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
@REM This script can be used to build the Spurs and its 
@REM supporting code
@REM
@REM

@if exist "build\classes" goto compile
@mkdir build\classes

:compile
@"%JAVA_HOME%\bin\javac.exe" -d build\classes src\qdspurs\*.java

