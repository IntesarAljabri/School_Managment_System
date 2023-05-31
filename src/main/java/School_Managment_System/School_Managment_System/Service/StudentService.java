package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Course;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private static StudentRepository studentRepository;

    //Add new Student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    //get all student
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    //get student by id
    public static Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    //create new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    //delete the student by id
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Deleted successfully";
    }

    //update the information about student
    public Student updateStudent(Long id, Student updateData) {
        Student students = studentRepository.findById(id).orElse(null);
        if (students != null) {
            students.setName(updateData.getName());
            students.setGender(updateData.getGender());
            return studentRepository.save(students);
        }
        return null;
    }
    //check if it isActive or not
    public List<Student> softDelete(){
        return studentRepository.findAllByisActive(true);
    }
}
