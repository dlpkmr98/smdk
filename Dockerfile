FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/smdk-0.0.1-SNAPSHOT.jar"]