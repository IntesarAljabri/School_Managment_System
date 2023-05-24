package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
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
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping(value = "getAll")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping(value = "getById")
    public Optional<Course> getCourseById(@RequestParam Long id) {

        return CourseService.getCourseById(id);
    }

    @PostMapping(value = "add")
    public String Course(@RequestBody Course course){
        CourseService.addCourse(course);
        return "Class added";
    }
//    @PostMapping
//    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
//        Course createdCourse = courseService.createCourse(course);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
//    }
//
  @PutMapping("/{id}")
  public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course) {
     course.setId(id);
     Course updatedCourse = courseService.updateCourse(course);
     if (updatedCourse != null) {
         return ResponseEntity.ok(updatedCourse);
     }
//    return ResponseEntity.notFound().build();
}
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<Optional<Course>> getStudentsByCourseId(@PathVariable Long id) {
        Optional<Course> students = courseService.getCourseById(id);
        return ResponseEntity.ok(students);
    }
}
