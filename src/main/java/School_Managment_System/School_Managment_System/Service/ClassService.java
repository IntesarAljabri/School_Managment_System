package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;
    public List<Classroom> getAllClasses() {
        return classRepository.findAll();
    }

    public Classroom getClassById(Long id) {
        return classRepository.getById(id);
    }

    public Classroom getClassroomtById(Long id) {
        return classRepository.findById(id).get();
    }
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    public Classroom addClass(Classroom classes) {
        return classRepository.save(classes);
    }

    public Classroom updateClass(Long id, Class updateData) {
        Classroom classroom = classRepository.findById(id).orElse(null);
        if (classroom != null) {
            classroom.setClassCode(Arrays.toString(updateData.getClasses()));
            classroom.setSize(updateData.getSize());
            return classRepository.save(classroom);
        }
        return null;
    }

}
