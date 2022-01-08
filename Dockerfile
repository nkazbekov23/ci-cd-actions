FROM openjdk:11
EXPOSE 8080
ADD target/ci-cd.jar ci-cd.jar
ENTRYPOINT ["java","-jar","/ci-cd.jar"]