package School_Managment_System.School_Managment_System.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Setter
@Getter
@Data
@MappedSuperclass
public class BaseEntity {

    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;

}
