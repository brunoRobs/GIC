package br.com.midiavox.GIC.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
//            User bruno = new User(
//                    "Bruno",
//                    "bruno@email.com",
//                    LocalDate.of(2001, Month.JUNE, 21)
//            );

            //userRepository.save(bruno);
        };
    }
}
