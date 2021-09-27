FROM openjdk:11-jdk-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} heroes.jar
ENTRYPOINT ["java","-jar","/heroes.jar"]