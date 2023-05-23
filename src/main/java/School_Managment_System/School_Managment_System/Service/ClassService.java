package School_Managment_System.School_Managment_System.Service;

import School_Managment_System.School_Managment_System.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    static
    ClassRepository classRepository;
    public List<Class> getAllClass() {

        return classRepository.findAll();
    }

    public static Optional<Class> getClassById(Long id) {
        return Optional.of(classRepository.getById(id));
    }

    public Class createClass(Class newClass) {
        return classRepository.save(newClass);
    }

    public static void addClass(Class Class){

        classRepository.save(Class);
    }
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
//    @Autowired
//    ClassRepository classRepository;
//
//    public List<Class> getAllClasses() {
//        return classRepository.findAll();
//    }


//    public Class updateClass(Class updatedClass) {
//        return classRepository.save(updatedClass);
//    }


}
