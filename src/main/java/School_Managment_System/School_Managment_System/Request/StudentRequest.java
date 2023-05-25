package School_Managment_System.School_Managment_System.Request;

import School_Managment_System.School_Managment_System.Model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {

    private Long id;
    private String name;
    private String gender;
    private int age;
    private String email;


    public String convertToStudent () {
        Date nowDate = new Date();
        Student student = new Student();
        student.setName(this.getName());
        student.setGender(this.getGender());
        student.setAge(this.getAge());
        student.setEmail(this.getEmail());
        student.setIsActive(true);
        student.setCreatedDate(nowDate);
        student.setUpdatedDate(nowDate);
        return student;
    }

}


