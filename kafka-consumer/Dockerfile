FROM openjdk:8
COPY target/kafka-consumer-0.0.1-SNAPSHOT.jar /root/
CMD ["mkdir", "/root/config"]
COPY src/main/resources/application.properties /root/config/
COPY src/main/resources/bootstrap.properties /root/config/
CMD ["java", "-jar", "/root/kafka-consumer-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:///root/config/"]