package School_Managment_System.School_Managment_System.Service;

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

    public static String addTeachers(@RequestBody Teacher teacher) {
        TeacherService.addTeachers(teacher);
        return "Class added";
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public String deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
        return "Deleted  Successfully";
    }

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
}
