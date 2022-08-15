mvn install


docker build -f ./Dockerfile -t hdchandesh108/docker-spring-boot-v2 .

-- Push Image to DockerHub
docker login

docker push hdchandesh108/docker-spring-boot-v2:latest



