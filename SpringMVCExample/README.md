sample-backend-template-with-gradle
=======================

rest-api backend none-gae : tomcat | jetty


To find similar project but using maven : git clone from git hub : https://github.com/sophea/sample-backend-templat

1 : install gradle

2 : install mariaDb database (https://downloads.mariadb.org/)

3 : import sql file in mysql console : sample-install.sql 

4 : go to this project location by console

5 : create class-path for eclipse :gralde eclipse:eclipse

6 : run command gradle clean jetty:run  or gradle clean tomcat:run

7 : sample APIs :

 a) monitor api : http://localhost:8080/SpringMVCExample/api/monitor/v1
 
 b) category api: http://localhost:8080/SpringMVCExample/api/category/v1/all


If you want to change database type :  have a look on file persistence-db.xml
