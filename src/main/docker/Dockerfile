#FROM jdk8
FROM java
VOLUME /tmp
ADD springboot-docker-1.0-SNAPSHOT.jar springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot.jar"]