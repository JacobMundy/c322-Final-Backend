FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/C322-Final-Backend-0.0.1-SNAPSHOT.jar C322-Final-Backend.jar
ENTRYPOINT ["java", "-jar", "C322-Final-Backend.jar"]