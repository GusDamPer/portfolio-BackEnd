FROM amazoncorretto:11-alpine-jdk

COPY target/GustavoP-0.0.1-SNAPSHOT.jar GustavoP-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/GustavoP-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080