
FROM openjdk:8
RUN mkdir var/lib/docker/tmp/docker-builder068287956/target
ADD target/employee-producer-docker.jar employee-producer-docker.jar
EXPOSE 7777
ENTRYPOINT ["java","-jar","employee-producer-docker.jar"]