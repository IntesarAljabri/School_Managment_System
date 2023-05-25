package School_Managment_System.School_Managment_System.Request;

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
public class TeacherRequest {
    private Long id;
    private String name;
    private String phone;
    private String specialization;
    private String age;

    public Teacher convertToTeacher () {
        Date nowDate = new Date();
        Teacher teacher = new Teacher();
        teacher.setName(this.getName());
        teacher.setPhone(this.getPhone());
        teacher.setSpecialization(this.getSpecialization());
        teacher.setAge(this.getAge());
        teacher.setIsActive(true);
        teacher.setCreatedDate(nowDate);
        teacher.setUpdatedDate(nowDate);
        return teacher;

    }

}
