FROM openjdk:11
COPY ./target/kafkaapp-01.jar app/kafkaapp-01.jar
WORKDIR /app
CMD ["java", "-jar", "kafkaapp-01.jar" ]

