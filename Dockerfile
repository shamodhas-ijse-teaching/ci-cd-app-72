# base image for java 17
FROM eclipse-temurin:17-jdk-alpine

# working dir for inside container
WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

# java -jar filename.jar
ENTRYPOINT ["java","-jar","app.jar"]