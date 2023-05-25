package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassResponse {

    private Long id;
    private String name;
    private String phone;
    private String specialization;
    private String age;

    public Classroom convertToClass () {
        
    }

}
