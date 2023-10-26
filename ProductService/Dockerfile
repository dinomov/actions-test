# Use the official OpenJDK base image with JDK 17
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project (including the pom.xml file) to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/product-service.jar

RUN cd ..

COPY wait-for-it.sh /app/wait-for-it.sh

# Expose the port your microservice will listen on (port 8087 in this case)
EXPOSE 8087

# Command to run the application
CMD ["java", "-jar", "/app/product-service.jar"]