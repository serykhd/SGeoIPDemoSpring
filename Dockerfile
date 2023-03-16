FROM azul/zulu-openjdk-alpine:19-latest
COPY target/geoip-demo-spring-1-shaded.jar geoip-demo-spring-1.jar
ENTRYPOINT ["java", "-jar", "/geoip-demo-spring-1.jar"]
EXPOSE 8080