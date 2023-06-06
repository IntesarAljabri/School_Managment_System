package School_Managment_System.School_Managment_System.Repository;
import School_Managment_System.School_Managment_System.Model.Classroom;
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
public interface ClassRepository extends JpaRepository<Classroom, Long> {
    List<Classroom> findAllByisActive(boolean active);

    @Query(value = "select cr from ClassRoom cr")
    List<Classroom> getAllClassRooms();

    @Query(value = "select cr from ClassRoom cr where cr.id = :classRoomId")
    Classroom getClassRoomById(@Param("classRoomId") Long id);

}
