package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@Setter
@Getter
@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String course_name;
    String grade;
    // Define the relationship with Student
    @OneToMany(mappedBy = "course")
    private List<Student> students;

    // Define the relationship with Teacher
    @OneToMany(mappedBy = "course")
    private List<Teacher> teachers;

}
