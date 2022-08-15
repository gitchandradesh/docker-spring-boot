FROM openjdk:18
ADD target/docker-spring-boot-v3.jar docker-spring-boot-v3.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "docker-spring-boot-v3.jar"] 