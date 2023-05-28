package School_Managment_System.School_Managment_System.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

public class StudentCourse extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String garde;
    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;
    @OneToMany
    List<Course> courses;
    @OneToMany
    private List<Student> students;
}
