package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String gender;

    @ManyToOne
    Classroom classes;
    @OneToMany
    List<Course> courses;

}
