package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Request.StudentRequest;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String email;

    public static StudentResponse convertRequestToResponse(Student studentRequest) {
        return StudentResponse.builder()
                .id(studentRequest.getId())
                .name(studentRequest.getName())
                .gender(studentRequest.getGender())
                .age(studentRequest.getAge())
                .email(studentRequest.getEmail())
                .build();

    }
}
