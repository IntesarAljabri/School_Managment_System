package School_Managment_System.School_Managment_System.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {

    private Long id;
    private String course_name;
    private String description;
    private String code;
}
