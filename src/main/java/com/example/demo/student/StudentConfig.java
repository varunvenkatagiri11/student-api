package com.example.demo.student;

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
            Student varun = new Student(
                    "Varun",
                    LocalDate.of(2005, Month.SEPTEMBER, 4),
                    "varunvenkatagiri985@gmail.com" ) ;

            Student vishnu = new Student(
                    "Vishnu",
                    LocalDate.of(2009, Month.JULY, 1),
                    "vishnu@gmail.com" ) ;
            repository.saveAll(List.of(varun,vishnu)
            );
        };
    }
}
