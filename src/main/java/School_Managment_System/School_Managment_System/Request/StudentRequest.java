package School_Managment_System.School_Managment_System.Request;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@PostMapping("/addStudent")
public class StudentRequest {

    private Long id;
    String name;
    String gender;
    Integer age;
    String email;
    private String nationality;


    public Object convertToStudent() {

    }
}


