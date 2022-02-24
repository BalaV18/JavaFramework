FROM openjdk:8
ADD target/classes/testng.xml /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","testng.xml"]
