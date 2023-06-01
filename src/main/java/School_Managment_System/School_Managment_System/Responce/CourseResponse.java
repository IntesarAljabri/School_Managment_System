package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseResponse {


    private Long id;
    private String course_name;
    private String description;
    private String code;

    public static CourseResponse convertRequestToResponse(Course courseRequest) {
        return CourseResponse.builder()
                .id(courseRequest.getId())
                .course_name((courseRequest.getCourse_name()))
                .description(courseRequest.getDescription())
                .code(courseRequest.getCode())
                .build();
    }

    public static List<CourseResponse> convertRequestListToResponseList(List<Course> courseRequest) {
    

}
