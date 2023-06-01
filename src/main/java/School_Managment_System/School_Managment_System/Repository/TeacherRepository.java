package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAllByisActive(boolean active);

    @Query(value = "select t from Teacher t")
    List<Teacher> getAllTeachers();

    @Query(value = "select t from Teacher t where t.id = :teacherId")
    Teacher getTeacherById(@Param("teacherId") Long id);
}
