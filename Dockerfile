FROM java:8-alpine

COPY target/uberjar/nisone.jar /nisone/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/nisone/app.jar"]
