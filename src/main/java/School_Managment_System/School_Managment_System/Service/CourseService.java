package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    static
    CourseRepository courseRepository;

    public static String addCourse(@RequestBody Course course) {
        CourseService.addCourse(course);
        return "Class added";
    }

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public static Optional<Course> getCourseById(Long courseId) {
        return courseRepository.findById(courseId);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    public Course updateCourse(Course course) {return courseRepository.save(course);}

}
