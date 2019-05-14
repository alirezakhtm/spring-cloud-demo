FROM openjdk:8
ADD target/lending-service-0.0.1-SNAPSHOT.jar lending-service-0.0.1-SNAPSHOT.jar
CMD ["mkdir", "/root/config"]
COPY src/main/resources/application.properties /root/config/
COPY src/main/resources/bootstrap.properties /root/config/
ENTRYPOINT ["java", "-jar", "lending-service-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:///root/config/"]