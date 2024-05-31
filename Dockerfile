FROM maven:3.9.7-eclipse-temurin-17-alpine AS builder

WORKDIR /kocak

COPY . /kocak

RUN mvn clean package

FROM eclipse-temurin:17.0.11_9-jre-alpine

WORKDIR /app

COPY --from=builder /kocak/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app/app.jar"]

