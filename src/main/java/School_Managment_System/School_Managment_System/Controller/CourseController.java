package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "getAll")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping(value = "getById")
    public Course getClassById(Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping(value = "add")
    public String Course(@RequestBody Course courses) {
        courseService.addCourse(courses);
        return "Class added";
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateCourse(@PathVariable Long id, @RequestBody Course courses) {
        courses.setId(id);
        Student updatedCourse = courseService.updateCourse(courses);

        if (updatedCourse != null) {
            return ResponseEntity.ok(updatedCourse);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return courseService.deleteCourse(id);
    }
}
