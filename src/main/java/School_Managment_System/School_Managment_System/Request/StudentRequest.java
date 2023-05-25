package School_Managment_System.School_Managment_System.Request;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@PostMapping("/addStudent")
public class StudentRequest addStudent (@RequestBody StudentRequest studentRequest) {

        Student savedStudent = studentServices.addStudent(studentRequest.convertToStudent());

        StudentResponse response = new StudentResponse(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getAge(),
                savedStudent.getGender(),
                savedStudent.getEmail(),
                savedStudent.getCreatedDate());
        return response;


}
