FROM maven:3-openjdk-11-slim AS maven_build
WORKDIR /build/

COPY pom.xml .
COPY src ./src/

RUN --mount=type=cache,target=/root/.m2/repository mvn clean package -U -Dmaven.test.skip

FROM gcr.io/distroless/java:11

COPY --from=maven_build /build/target/*.jar /app/app.jar

CMD ["/app/app.jar"]