package School_Managment_System.School_Managment_System.Responce;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import lombok.*;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassResponse {

    private Long id;
    private Integer size;
    private String classCode;

    public static ClassResponse convertRequestToResponse(Classroom classRequest) {
        return ClassResponse.builder()
                .id(classRequest.getId())
                .size(classRequest.getSize())
                .classCode(classRequest.getClassCode())
                .build();
    }

    public static List<ClassResponse> convertRequestListToResponseList(List<Classroom> classRequest) {
        List<ClassResponse> classResponseList = new ArrayList<>();
        if (!classRequest.isEmpty()) {
            for (Classroom classRoomRequest : classRequest) {
                classResponseList.add(convertRequestToResponse(classRoomRequest));
            }
        }
        return classResponseList;
    }

}
