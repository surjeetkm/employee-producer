
FROM openjdk:8
ADD C:/Users/HP probook 6470b/Documents/workspace-sts-3.9.10.RELEASE/microservice/employee-producer/target/employee-producer-docker.jar employee-producer-docker.jar
EXPOSE 7777
ENTRYPOINT ["java","-jar","employee-producer-docker.jar"]