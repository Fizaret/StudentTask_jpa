package az.ingress.springdatajpa;

import az.ingress.springdatajpa.domain.Student;
import az.ingress.springdatajpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class SpringDataJpaApplication implements CommandLineRunner {

  private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class);

    }
    @Override
    public void run(String... args) throws Exception{
        Student student = Student.builder()
                .age(19)
                .firstName("Fizaret")
                .lastName("Qelbinur")
                .studentNumber("7MSD114")
                .build();
        studentRepository.save(student);

    }
}
