# Use the official OpenJDK base image with JDK 17
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project (including the pom.xml file) to the container
COPY target/EurekaServer-0.0.1-SNAPSHOT.jar /app/eureka-server.jar

# Expose the port your microservice will listen on (port 8761 in this case)
EXPOSE 8761

# Command to run the application
CMD ["java", "-jar", "/app/eureka-server.jar"]