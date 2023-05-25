package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherResponse {

    private Long id;
    String name;
    String gender;
    String specialization;
    String age;

    public Teacher convertToTeacher () {
        Date nowDate = new Date();
        Teacher teacher = new Teacher();
        teacher.setName(this.getName());

    }
}


