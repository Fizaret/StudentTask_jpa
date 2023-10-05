package az.ingress.springdatajpa.configuration;

import az.ingress.springdatajpa.domain.Student;
import az.ingress.springdatajpa.repository.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {
    @Bean
    public org.modelmapper.ModelMapper getModelMapper(){
        return new org.modelmapper.ModelMapper();
    }
}
