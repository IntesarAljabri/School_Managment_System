package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private static StudentRepository studentRepository;

    public static String addStudent(@RequestBody Student student) {
        StudentService.addStudent(student);
        return "Class added";
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public static Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Course> getCoursesByStudentId(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(Student::getCourses).orElse(Collections.emptyList());
    }

}
