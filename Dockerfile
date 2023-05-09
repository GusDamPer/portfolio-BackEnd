FROM amazoncorretto:11-alpine-jdk
MAINTAINER GustavoP
COPY target/GustavoP-0.0.1-SNAPSHOT.jar GustavoP-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/GustavoP-0.0.1-SNAPSHOT.jar"]

