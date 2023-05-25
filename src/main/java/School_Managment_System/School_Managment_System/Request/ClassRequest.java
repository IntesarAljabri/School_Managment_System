package School_Managment_System.School_Managment_System.Request;

import School_Managment_System.School_Managment_System.Model.Classroom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassRequest {

    private Long id;
    private Integer size;
    private String classCode;

    public Classroom convertToClass () {
        Date nowDate = new Date();
        Classroom classroom = new Classroom();
        classroom.setSize(this.getSize());
        classroom.setClassCode(this.getClassCode());

        classroom.setIsActive(true);
        classroom.setCreatedDate(nowDate);
        return classroom;
    }
}
