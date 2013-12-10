@echo ******************************************************
@echo Start test...
@echo ******************************************************

java -Djava.ext.dirs=%AXIS2_HOME%\lib;%JAVA_HOME%\jre\lib\ext -cp target/classes cn.edu.sdu.middleware.axis2.clients.AccountClient

@echo ******************************************************
@echo Test Finished Successfully...
@echo ******************************************************

pause