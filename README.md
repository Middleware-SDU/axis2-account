# Web Service 开发练习 【Middle Ware - SDU】#

##### 基于Web Container 的 Web Service 开发练习 #####

##### 基于EJB Container 的 Web Service 开发练习 ：https://github.com/Middleware-SDU/webserviePractice #####


##### 用Web service 开发银行账户管理系统，功能如下： #####

 - 1 创建账户 

 - 2 查询余额 

 - 3 存款 

 - 4 取款
 
##### How To Get it Running(仅支持windows)？#####

 - 安装JDK(At least JRE).需设置JAVA_HOME环境变量.
 
 - 安装AXIS2(本实验使用的是axis2-1.6.2版本)，需设置AXIS2_HOME环境变量.
 
 - 安装Maven（本实验使用maven-3.0.4），需设置M2_HOME环境变量.
 
 - 打开axis2的web应用：%AXIS2_HOME%\bin\axis2server.bat
 
 - 在CMD中，进入本项目根目录，执行mvn clean package，然后将生成的jar包copy到%AXIS2_HOME%\repository\servicejars目录下。
   如果该目录不存在，请手动创建。
 
 - 运行项目根路径下的：accountClient.bat
 
 ##### Finish, Good luck! #####
