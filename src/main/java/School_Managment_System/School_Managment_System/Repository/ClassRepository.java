package School_Managment_System.School_Managment_System.Repository;

import School_Managment_System.School_Managment_System.Model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classroom, Long> {
}
