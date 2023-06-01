package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByisActive(boolean active);
    @Query(value = "select s from Student s")
    List<Student> getAllStudents();

    @Query(value = "select s from Student s where s.id = :studentId")
    Student getStudentById(@Param("studentId") Long id);
}
