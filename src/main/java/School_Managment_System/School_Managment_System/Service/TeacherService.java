package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private static TeacherRepository teacherRepository;

    //add new teacher
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    //get all teacher
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    //get teacher by id
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    //delete teacher
    public String deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
        return "Deleted  Successfully";
    }

    //update information about Teacher
    public Teacher updateTeacher(Long id, Teacher updateData){
        Teacher teacher = teacherRepository.findById(id).orElse(null);

        if (teacher != null) {
            teacher.setName(updateData.getName());
            teacher.setPhone(updateData.getPhone());
            teacher.setSpecialization(updateData.getSpecialization());
           teacher.setAge(updateData.getAge());
            teacher.setCourses(updateData.getCourses());

            return teacherRepository.save(teacher);
        }
        return null;
    }
    //check if it isActive or not
    public List<Teacher> softDelete(){
        return teacherRepository.findAllByisActive(true);
    }
}
