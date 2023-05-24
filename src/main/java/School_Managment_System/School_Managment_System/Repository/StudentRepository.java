package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
