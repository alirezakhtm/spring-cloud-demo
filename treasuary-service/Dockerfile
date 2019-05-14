FROM openjdk:8
COPY "target/treasuary-service-0.0.1-SNAPSHOT.jar" "/root/"
ADD target/treasuary-service-0.0.1-SNAPSHOT.jar treasuary-service-0.0.1-SNAPSHOT.jar
CMD ["mkdir", "/root/config"]
COPY src/main/resources/application.properties /root/config/
COPY src/main/resources/bootstrap.properties /root/config/
ENTRYPOINT ["java", "-jar", "treasuary-service-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:///root/config/"]