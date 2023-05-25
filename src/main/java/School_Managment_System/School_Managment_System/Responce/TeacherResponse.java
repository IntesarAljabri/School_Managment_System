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
    private String name;
    private String phone;
    private String specialization;
    private String age;


}


