package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Data
@Setter
@Getter
@Table(name = "Student_Course")
public class Student_Course {

    @OneToMany
    Course id;

    @OneToMany
    Student st_id;


}
