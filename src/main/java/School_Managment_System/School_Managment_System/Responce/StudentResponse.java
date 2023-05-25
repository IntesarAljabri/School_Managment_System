package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Request.StudentRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String email;



    public Student convertToStudent () {
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
