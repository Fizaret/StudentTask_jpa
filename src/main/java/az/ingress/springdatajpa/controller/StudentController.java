package az.ingress.springdatajpa.controller;

import az.ingress.springdatajpa.repository.StudentRepository;
import az.ingress.springdatajpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/car")
@RequiredArgsConstructor
public class StudentController {
  private final StudentService studentService;


    @GetMapping
    public List<StudentRepository> findAll() {
        return studentService.findAll();
    }


    @PostMapping()
    public void create(@RequestBody StudentRepository studentRepository) {
        studentService.createCar(studentRepository);
    }


}

