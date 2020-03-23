
FROM openjdk:8
# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/employee-producer-kubernate.jar $PROJECT_HOME/employee-producer-kubernate.jar

WORKDIR $PROJECT_HOME

CMD ["java", "-jar", "./employee-producer-kubernate.jar"]










