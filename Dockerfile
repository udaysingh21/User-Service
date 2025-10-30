# Step 1: Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy the JAR file (make sure this matches your jar name)
COPY user-service/target/user-service-1.0.0.jar app.jar

# Step 4: Expose port (change if needed)
EXPOSE 8080

# Step 5: Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
