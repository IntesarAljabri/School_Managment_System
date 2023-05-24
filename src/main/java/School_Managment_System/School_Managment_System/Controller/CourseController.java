package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Course getClassById(Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping(value = "add")
    public String Course(@RequestBody Course courses) {
        courseService.addCourse(courses);
        return "Class added";
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Object> deleteCourse(@PathVariable Long id) {
//        courseService.deleteCourse(id);
//        return ResponseEntity.noContent().build();
//    }

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
//        if (updatedCourse != null) {
//            return ResponseEntity.ok(updatedCourse);
//        }
    return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
