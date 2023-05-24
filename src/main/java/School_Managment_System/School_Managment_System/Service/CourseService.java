package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Repository.ClassRepository;
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

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }


    public Course getCourseById(Long id) {
        return courseRepository.getById(id);
    }

    public Course addCourse(Course courses) {
        return courseRepository.save(courses);
    }
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    public Course updateCourse(Course course) {return courseRepository.save(course);}

}
