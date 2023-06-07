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
@Table(name = "Course")
public class Course extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String courseName;
    String description;
    String code;

    //relationship of teacher
    @OneToOne
    private Teacher teachers;

}
