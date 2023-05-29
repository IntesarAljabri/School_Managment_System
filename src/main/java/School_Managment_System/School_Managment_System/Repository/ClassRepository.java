package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Classroom, Long> {
    List<Classroom> findAllByisActive(boolean active);
}
