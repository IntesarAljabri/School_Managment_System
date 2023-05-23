package School_Managment_System.School_Managment_System.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Optional<Course> course = courseService.getCourseById(id);
        return course.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCourse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course) {
        Optional<Course> existingCourse = courseService.getCourseById(id);
        if (existingCourse.isPresent()) {
            course.setId(id);
            Course updatedCourse = courseService.updateCourse(course);
            return ResponseEntity.ok(updatedCourse);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        Optional<Course> existingCourse = courseService.getCourseById(id);
        if (existingCourse.isPresent()) {
            courseService.deleteCourse(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<List<Student>> getStudentsByCourseId(@PathVariable Long id) {
        List<Student> students = courseService.getStudentsByCourseId(id);
        return ResponseEntity.ok(students);
    }
}
