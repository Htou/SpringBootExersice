package com.seriousgame.protoype.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hichem = new Student(
                    "Hichem",
                    "h.touati@tutanota.com",
                    LocalDate.of(1993, Month.SEPTEMBER, 11)

            );

            Student alex = new Student(
                    "Alex",
                    "alex@tutanota.com",
                    LocalDate.of(1983, Month.JANUARY, 23)
            );

            repository.saveAll(List.of(hichem, alex));
        };
    }
}
