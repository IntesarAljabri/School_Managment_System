package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
@Entity
@Setter
@Getter
@Data

public class BaseEntity {

    private Date createdDate;
    private Boolean isActive;
    private Date updatedDate;
}
