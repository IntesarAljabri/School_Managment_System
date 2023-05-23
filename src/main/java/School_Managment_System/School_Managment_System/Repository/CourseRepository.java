package School_Managment_System.School_Managment_System.Repository;

import School_Managment_System.School_Managment_System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
