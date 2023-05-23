package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public static Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

//    public List<Teacher> getTeachersByCourse(Long id) {
//        return teacherRepository.getCourseById(id);
//    }
}
