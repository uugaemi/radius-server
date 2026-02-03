FROM eclipse-temurin:25-jre-jammy

WORKDIR /app

COPY build/libs/app.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]