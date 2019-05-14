FROM openjdk:8
ADD target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
CMD ["mkdir", "/root/config"]
CMD ["mkdir", "/root/config/global-config"]
COPY "src/main/resources/application.properties" "/root/config/"
COPY "configfiles/cifservice.properties" "/root/config/global-config/"
COPY "configfiles/kafkaconsumer.properties" "/root/config/global-config/"
COPY "configfiles/lendingservice.properties" "/root/config/global-config/"
COPY "configfiles/treasuaryservice.properties" "/root/config/global-config/"
COPY "configfiles/uiserver.properties" "/root/config/global-config/"
RUN apt-get install -qy git
CMD ["git", "config", "--global", "user.email", "alireza.khtm@gmail.com"]
CMD ["git", "config", "--global", "user.name", "alirezakhtm"]
ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:///root/config/"]