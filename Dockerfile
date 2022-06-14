FROM openjdk:8-jdk-alpine
EXPOSE 8081
ADD target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.0.2-SNAPSHOT.jar Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.0.2-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-1.0.2-SNAPSHOT.jar"]