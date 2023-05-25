package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Course;
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
public class CourseResponse {


    private Long id;
    private String course_name;
    private String description;
    private String code;

    public Course convertToCourse () {
        Date nowDate = new Date();
        Course course = new Course();

}
