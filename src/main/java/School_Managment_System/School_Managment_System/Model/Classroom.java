package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Setter
@Getter
@Entity
@Table(name = "Class")
public class Classroom{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Integer size;
    String classCode;


    @OneToMany
    private List<Course> courses;

}
