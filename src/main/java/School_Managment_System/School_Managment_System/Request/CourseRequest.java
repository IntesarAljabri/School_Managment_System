package School_Managment_System.School_Managment_System.Request;

import School_Managment_System.School_Managment_System.Model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {

    private Long id;
    private String course_name;
    private String description;
    private String code;

    public Course convertToCourse () {
        Date nowDate = new Date();
        Course course = new Course();
        course.setCourse_name(this.getCourse_name());
        course.setDescription(this.getDescription());
        course.setCode(this.getCode());
        course.setIsActive(true);
        course.setCreatedDate(nowDate);
        return course;

    }
}
