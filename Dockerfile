FROM maven:3.8.2-jdk-8 AS BUILD_MAVEN3_JAVA8_IMAGE
WORKDIR /build
COPY . /build/
RUN mvn clean package


FROM openjdk:8-jre
WORKDIR /app/
COPY --from=BUILD_MAVEN3_JAVA8_IMAGE /build/target/boot-met-swaggger-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java","-jar","boot-met-swaggger-service-0.0.1-SNAPSHOT.jar"]