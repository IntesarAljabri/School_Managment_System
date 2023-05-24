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
    private String nationality;
    private String grade;
    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;

    @ManyToOne
    Classroom classes;
    @OneToMany
    List<Course> courses;

}
