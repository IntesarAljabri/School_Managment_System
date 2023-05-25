package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Request.StudentRequest;
import School_Managment_System.School_Managment_System.Request.TeacherRequest;
import School_Managment_System.School_Managment_System.Responce.StudentResponse;
import School_Managment_System.School_Managment_System.Responce.TeacherResponse;
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
@RequestMapping("api/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping(value = "getAll")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeachers();
    }

    @GetMapping(value = "getById")
    public Teacher getTeacherById(@RequestParam Long id) {
        return teacherService.getTeacherById(id);
    }

//    @PostMapping(value = "add")
//    public String Teacher(@RequestBody Teacher teacher) {
//        TeacherService.addTeachers(teacher);
//        return "Class added";
//    }

    @PostMapping("/addTeacher")
    public TeacherResponse addTeacher(@RequestBody TeacherRequest teacherRequest) {
        Teacher savedTeacher = teacherService.addTeacher(teacherRequest.convertToTeacher());

        TeacherResponse response = new TeacherResponse(
                savedTeacher.getId(),
                savedTeacher.getName(),
                savedTeacher.getPhone(),
                savedTeacher.getSpecialization(),
                savedTeacher.getAge()
        );

        return response;
    }

    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return teacherService.deleteTeacher(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher updateData){
        Teacher teachers = teacherService.updateTeacher(id , updateData);
        if (teachers != null) {
            return ResponseEntity.ok(teachers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


