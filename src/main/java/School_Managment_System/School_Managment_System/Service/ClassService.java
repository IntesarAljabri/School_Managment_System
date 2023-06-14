package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    //get all class
    public List<Classroom> getAllClasses() {
        return classRepository.findAll();
    }

    //get class by id
    public Classroom getClassById(Long id) {
        return classRepository.getById(id);
    }

     //get class by id
    public Classroom getClassroomtById(Long id) {
        return classRepository.findById(id).get();
    }

    //delete class
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    //add new class
    public Classroom addClass(Classroom classes) {
        return classRepository.save(classes);
    }

    //update the information about class
    public Classroom updateClass(Classroom updateData) {
        Classroom classroom = classRepository.findById(updateData.getId()).orElse(null);
        if (classroom != null) {
            classroom.setSize(updateData.getSize());
            classroom.setClassCode(updateData.getClassCode());
            return classRepository.save(classroom);
        }
        return null;
    }
    //check if it isActive or not
    public List<Classroom> softDelete(){
        return classRepository.findAllByisActive(true);
    }
}
