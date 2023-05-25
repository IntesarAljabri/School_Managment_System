package School_Managment_System.School_Managment_System.Model;

import lombok.*;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String gender;
    Integer age;
    String email;
    private String nationality;
    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;

    @ManyToOne
    Classroom classes;
    @OneToMany
    List<Course> courses;

    public Student convertToStudent(String name, String gender, String nationality, String grade, Date createdDate,
                                    Boolean isActive, Date updatedDate, Classroom classes, List<Course> courses) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.createdDate = createdDate;
        this.isActive = isActive;
        this.updatedDate = updatedDate;
        this.classes = classes;
        this.courses = courses;

    }

}

