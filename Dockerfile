FROM openjdk:11-jdk
VOLUME /tmp
RUN mkdir /application
COPY . /application
WORKDIR /application
RUN /application/mvnw install 
RUN mv /application/target/*.jar /application/app.jar
ENTRYPOINT ["java","-jar","/application/app.jar"]
