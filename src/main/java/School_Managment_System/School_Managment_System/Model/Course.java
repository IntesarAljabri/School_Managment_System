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
    String course_name;
    String description;
    String code;
    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;
    @OneToOne
    private Teacher teachers;

}
