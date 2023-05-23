package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Repository.StudentRepository;
import School_Managment_System.School_Managment_System.Service.ClassService;
import School_Managment_System.School_Managment_System.Service.CourseService;
import School_Managment_System.School_Managment_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "getAll")
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "getById")
    public Optional<Student> getStudentById(@RequestParam Long id) {

        return StudentService.getStudentById(id);
    } @PostMapping(value = "add")
    public String Student(@RequestBody Student student){
        StudentService.addStudent(student);
        return "Class added";
    }


//    @PostMapping
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//        Student savedStudent = studentService.save(student);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
//    }
}
