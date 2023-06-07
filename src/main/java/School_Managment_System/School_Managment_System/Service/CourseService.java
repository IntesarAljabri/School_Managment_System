package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CourseService {
    @Autowired
    static
    CourseRepository courseRepository;

    //get all course
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    //get course by id
    public Course getCourseById(Long id) {
        return courseRepository.getById(id);
    }

    //add new course
    public Course addCourse(Course courses) {
        return courseRepository.save(courses);
    }

    //delete course by id
    public String deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
        return "successfully Deleted";
    }

    //update information about course
    public Course updateCourse(Course updateData) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course != null) {
            course.setCourseName(updateData.getCourseName());
            course.setTeachers(updateData.getTeachers());
            return courseRepository.save(course);
        }
        return null;
    }

    //check if it isActive or not
    public List<Course> softDelete(){
        return courseRepository.findAllByisActive(true);
    }
}
