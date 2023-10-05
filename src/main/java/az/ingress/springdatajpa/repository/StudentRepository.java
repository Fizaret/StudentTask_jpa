package az.ingress.springdatajpa.repository;
import az.ingress.springdatajpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student , Long>{
    List<Student> findByFirstName(String fizaret);
    List<Student> findByFirstNameAndLastName(String fizaret, String qelbinur);



    @Query("SELECT s FROM Student s WHERE s.firstName= ?1 AND s.lastName= ?2")
    List<Student>findStudentsWithJPQL(String firstName,String lastName);


    @Query(nativeQuery = true,value = "Select * From our_students s where s.first_Name = ?1 AND s.last_Name = ?2")
    List<Student> findStudentsWithNativeSql(String fizaret, String qelbinur);

    Long getId();
    Student getAge();


}
