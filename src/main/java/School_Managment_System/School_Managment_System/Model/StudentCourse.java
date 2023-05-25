package School_Managment_System.School_Managment_System.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String garde;

    @OneToMany
    List<Course> courses;

    @OneToMany
    private List<Student> students;
}
