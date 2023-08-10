# spring-web-application
A simple Web Application with Spring Boot, Spring Web MVC, and Moustache

## Requirements
- Java SDK 17+
- Maven 3+

## Spring Boot
- The base project was created with https://start.spring.io/
- Spring Boot 3.1.2, Java 17, Spring Web (Jakarta EE 9)

## Managing Java SDK with sdkman
Install the tool:
```bash
curl -s "https://get.sdkman.io" | bash
```

## Install Java SDK 17
```bash
sdk install java 17.0.2-tem
java -version
```

## Setting the Port
By default, the web server listens on port 8080: http://localhost:8080. You can change this behavior by adding 
an override in /src/resources/application/properties as follows:
```
server.port = 9000
```

## Build the Project
```bash
mvn clean install
```

