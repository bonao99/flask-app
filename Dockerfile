FROM openjdk:11
LABEL key="Tony Mejia"
COPY target/dockerspringapp-0.0.1-SNAPSHOT.jar dockerspringapp.jar
ENTRYPOINT ["java", "-jar", "dockerspringapp.jar"]
