package dev.tafoya.springtest;

import dev.tafoya.springtest.run.Location;
import dev.tafoya.springtest.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class SpringTestApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringTestApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(SpringTestApplication.class, args);

        // log.info("Application started successfully!"); Making a status log

    }

    @Bean
    CommandLineRunner runner() {
        return args ->{
            Run run = new Run( 3456, "England Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
            log.info("RUN:" +run.toString());
        };
    }
}
