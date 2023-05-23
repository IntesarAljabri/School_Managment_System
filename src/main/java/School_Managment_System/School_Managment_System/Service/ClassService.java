package School_Managment_System.School_Managment_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.loading.ClassLoaderRepository;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClassService {
    @Autowired
    ClassLoaderRepository classRepository;

    public List<Class> getAllClasses(Long id) {
        return Collections.singletonList(classRepository.getClass());
    }
    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }
    public Class createClass(Class newClass) {
        return classRepository.save(newClass);
    }
    public Class updateClass(Class updatedClass) {
        return classRepository.save(updatedClass);
    }
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
