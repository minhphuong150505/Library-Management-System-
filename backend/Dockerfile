FROM maven:3.9.11-eclipse-temurin-17-alpine AS build
WORKDIR /workspace

COPY pom.xml ./
RUN mvn --batch-mode --no-transfer-progress dependency:go-offline
COPY src ./src
RUN mvn --batch-mode --no-transfer-progress clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
RUN addgroup -S library && adduser -S library -G library
WORKDIR /app
COPY --from=build --chown=library:library /workspace/target/Library-Management-System-0.0.1-SNAPSHOT.jar app.jar
USER library
EXPOSE 5000
ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75.0", "-jar", "/app/app.jar"]

