package School_Managment_System.School_Managment_System.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassRequest {

    private Long id;
    private Integer size;
    private String classCode;
}
