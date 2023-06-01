package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Course;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByisActive(boolean active);

    @Query(value = "select c from Course c")
    List<Course> getAllCourses();

    @Query(value = "select c from Course c where c.id = :courseId")
    Course getCourseById(@Param("courseId") Long id);

}
