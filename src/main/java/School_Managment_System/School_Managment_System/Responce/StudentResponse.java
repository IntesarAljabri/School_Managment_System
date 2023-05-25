package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Request.StudentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentResponse {

    private Long id;
    String name;
    String gender;
    Integer age;
    String email;
    private String nationality;

    @PostMapping("/addStudent")
    public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentRequest studentRequest) {
        Student savedStudent = StudentService.addStudent(studentRequest.convertToStudent());

        StudentResponse response = new StudentResponse(
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getNationality(),
                savedStudent.getCreatedDate()
        );

        return ResponseEntity.ok(response);
    }

}
