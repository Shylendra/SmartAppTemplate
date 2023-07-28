FROM openjdk:8
EXPOSE 7081
ADD smartapp-web/target/smartapp-api.jar smartapp-api.jar
ENTRYPOINT ["java","-jar","/smartapp-api.jar"]

