package School_Managment_System.School_Managment_System.Responce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
