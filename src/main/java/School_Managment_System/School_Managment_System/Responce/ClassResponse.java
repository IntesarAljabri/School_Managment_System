package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassResponse {

    private Long id;
    private Integer size;
    private String classCode;

    public Classroom convertToClass () {
        Date nowDate = new Date();
        Classroom classroom = new Classroom();
        classroom.setSize(this.getSize());
        classroom.setClassCode(this.getClassCode());

        classroom.setIsActive(true);
        classroom.setCreatedDate(nowDate);
        return classroom;
    }

}
