package ru.serykhd.geoipdemospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class GeoIPServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoIPServerApplication.class, args);
    }


}
