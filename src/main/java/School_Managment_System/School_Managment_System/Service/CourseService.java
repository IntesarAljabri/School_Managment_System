package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    static
    CourseRepository courseRepository;

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.getById(id);
    }

    public Course addCourse(Course courses) {
        return courseRepository.save(courses);
    }
    public String deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
        return "successfully Deleted";
    }

    public Course updateCourse(Course course) {return courseRepository.save(course);}

}
