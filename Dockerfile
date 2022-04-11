FROM openjdk:8
EXPOSE 8080
ADD target/springbootdb.jar springbootdb
ENTRYPOINT ["java","-jar","/springbootdb.jar"]
