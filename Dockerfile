FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/C322-Final-Backend-1.0-SNAPSHOT.jar C322-Final-Backend.jar
ENTRYPOINT ["java", "-jar", "C322-Final-Backend.jar"]