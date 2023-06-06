package School_Managment_System.School_Managment_System.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Setter
@Getter
@Entity
@Table(name = "Teacher")
public class Teacher extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String phone;
    String specialization;
    String age;

    //RelationShip between course and teacher
    @OneToOne
    private Course courses;
}