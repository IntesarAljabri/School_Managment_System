package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
