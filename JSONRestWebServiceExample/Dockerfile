FROM jamesdbloom/docker-java8-maven

MAINTAINER Chuangyu Cheng "charleschengcy94@gmail.com"

WORKDIR /code

ENV host 0.0.0.0

ADD pom.xml /code/pom.xml
ADD src /code/src
#ADD settings.xml /root/.m2/settings.xml

RUN ["mvn", "package"]

EXPOSE 8080

ENTRYPOINT ["java", "-cp", "target/lib/*:target/JSONRestWebServiceExample-1.0-SNAPSHOT.jar","com.javacodegeeks.examples.jersey.AuthorService"]

CMD ["-Djava.awt.headless=true"]
