FROM openjdk:23-jdk-slim

WORKDIR /app

# Copy the built JAR file from target directory
COPY target/connecting-mysql-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8030

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]


