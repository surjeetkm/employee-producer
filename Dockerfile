
FROM openjdk:8
RUN mkdir target
ADD target/employee-producer-docker.jar employee-producer-docker.jar
EXPOSE 7777
ENTRYPOINT ["java","-jar","employee-producer-docker.jar"]