@echo off

set DEPLOY_DIR=%TOMCAT_HOME%\webapps
set ADVISOR_SERVER_HOME=C:\Blaze\Advisor75
set ADVISOR_COMMON_HOME=C:\Blaze\Advisor75
set ADVISOR_ENGINE_HOME=C:\Blaze\Advisor75
set ADVISOR_IRT_HOME=C:\Blaze\Advisor75
set ADVISOR_LICENSE=%ADVISOR_SERVER_HOME%\..\license

set ADVSVR_CLASSPATH=%ADVISOR_LICENSE%
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_COMMON_HOME%\lib\AdvCommon.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_ENGINE_HOME%\lib\Advisor.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\AdvisorSvr.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_IRT_HOME%\lib\InnovatorRT.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_IRT_HOME%\lib\dmcom.jar

set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\FastInfoset.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\gmbal-api-only.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\ha-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\javax.annotation-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\javax.xml.soap-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxb-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxb-core.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxb-impl.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxb-jxc.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxb-xjc.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxws-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxws-rt.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jaxws-tools.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\jsr181-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\management-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\mimepull.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\policy.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\resolver.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\saaj-impl.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\stax-ex.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\stax2-api.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\streambuffer.jar
set ADVSVR_CLASSPATH=%ADVSVR_CLASSPATH%;%ADVISOR_SERVER_HOME%\lib\glassfish\jaxws-ri\woodstox-core-asl.jar

set CLASSPATH=build\classes;%ADVSVR_CLASSPATH%

set CLASSPATH=%CLASSPATH%;C:\FICO\GIT\Blaze\Projetos\BlazeGenerics\javaProjects\BOM_Generic\Export\blazeGenerics1.1.jar;

set PATH=%JAVA_HOME%\bin;%PATH%