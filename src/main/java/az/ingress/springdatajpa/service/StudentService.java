package az.ingress.springdatajpa.service;
import az.ingress.springdatajpa.configuration.ModelMapper;
import az.ingress.springdatajpa.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.misc.Utils;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService{
    private final ModelMapper modelMapper;
    private final StudentRepository studentRepository;

    @PostConstruct
    public void jpql(){
        studentRepository.findStudentsWithJPQL("Fizaret", "Qelbinur")
                .stream()
                .forEach(System.out::println);

    }
    @PostConstruct
    public void sql(){
        studentRepository.findStudentsWithNativeSql("Fizaret", "Qelbinur")
                .stream()
                .forEach(System.out::println);


    }

    public void createCar(StudentRepository studentRepository) {
    }

    public List<StudentRepository> findAll() {
        return null;
    }
}


