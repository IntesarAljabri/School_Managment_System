package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Service.CourseService;
import School_Managment_System.School_Managment_System.Service.StudentService;
import School_Managment_System.School_Managment_System.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping(value = "getAll")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeachers();
    }

    @GetMapping(value = "getById")
    public Optional<Teacher> getTeacherById(@RequestParam Long id) {

        return TeacherService.getTeacherById(id);
    }
    @PostMapping(value = "add")
    public String Teacher(@RequestBody Teacher teacher){
        TeacherService.addTeachers(teacher);
        return "Class added";
    }

    @PostMapping
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
        Teacher createdTeacher = teacherService.createTeacher(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTeacher);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
//        Optional<Teacher> existingTeacher = teacherService.getTeacherById(id);
//        if (existingTeacher.isPresent()) {
//            teacher.setId(id);
//            Teacher updatedTeacher = teacherService.updateTeacher(teacher);
//            return ResponseEntity.ok(updatedTeacher);
//        }
//        return ResponseEntity.notFound().build();
//    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        Optional<Teacher> existingTeacher = teacherService.getTeacherById(id);
        if (existingTeacher.isPresent()) {
            teacherService.deleteTeacher(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
