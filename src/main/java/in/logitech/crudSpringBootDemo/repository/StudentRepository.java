package in.logitech.crudSpringBootDemo.repository;

import in.logitech.crudSpringBootDemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    Optional<Student> findByIdAndDeletedIsFalse(Long id);


    List<Student> findAllByDeletedIsFalse();

    // findBy + fieldName + Condition -->> This is how custom methods are created
}
