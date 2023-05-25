package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "getById")
    public Student getStudentById(Long id) {
        return studentService.getStudentById(id).get();
    }

        @PostMapping(value = "add")
    public String Student(@RequestBody Student students) {
        studentService.addStudents(String.valueOf(students));
        return "Class added";
}
        @DeleteMapping("/{id}")
        public String deleteStudent (@PathVariable Long id){
            studentService.deleteStudent(id);
            return studentService.deleteStudent(id);
        }

        @PutMapping("{id}")
        public ResponseEntity<Student> updateStudent (@PathVariable Long id, @RequestBody Student updateData){
            Student students = studentService.updateStudent(id, updateData);
            if (students != null) {
                return ResponseEntity.ok(students);
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }