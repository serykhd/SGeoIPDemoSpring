package ru.serykhd.geoipdemospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.serykhd.geoipdemospring")
public class GeoIPServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoIPServerApplication.class, args);
    }


}
