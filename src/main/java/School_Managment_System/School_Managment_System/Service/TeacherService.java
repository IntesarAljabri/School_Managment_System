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

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public String deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
        return "Deleted  Successfully";
    }
}
