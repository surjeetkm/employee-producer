
FROM openjdk:8
RUN mkdir -p /test/code/
ADD employee-producer-docker.jar /test/code/
EXPOSE 7777
ENTRYPOINT ["java","-jar","employee-producer-docker.jar"]