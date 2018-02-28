# proyectoMaster
It's a Maven project with Struts2, hibernate and Spring core.
Apache Tomcat 8, spring.version>3.0.1.RELEASE, hibernate.version>3.5.0-Final, struts.version>2.1.8.1, junit<>3.8.1<
servlet-api>2.4,jsp-api>2.0, commons-fileupload>1.1.1, persistence-api>1.0,mysql-connector-java>5.1.44,slf4j-simple>1.5.6

Create database with proper name, configure hibernate.properties with user, pass and url
then launch mvn clean install tomcat8:run you should see login form in http://localhost:8080/struts-hibernate/index.jsp.
