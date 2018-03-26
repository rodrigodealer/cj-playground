FROM openjdk:alpine

COPY target/bibliothek-cj-0.1.0-SNAPSHOT-standalone.jar /opt/bibliothek.jar

CMD ["java", "-jar", "/opt/bibliothek.jar"]
