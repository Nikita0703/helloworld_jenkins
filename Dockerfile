FROM openjdk:17
ADD /target/helloworld_jenkins-0.0.1-SNAPSHOT.jar helloworld.jar
ENTRYPOINT ["java","-jar","helloworld.jar"]