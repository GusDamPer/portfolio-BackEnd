FROM amazoncorretto:11-alpine-jdk
MAINTAINER GustavoP
COPY target/GustavoP-0.0.1-SNAPSHOT.jar GustavoP-app.jar
ENTRYPOINT ["java","-jar","/GustavoP-app.jar"]

