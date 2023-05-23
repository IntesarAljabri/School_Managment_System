package School_Managment_System.School_Managment_System.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.loading.ClassLoaderRepository;
import java.util.List;

@Service
public class ClassService {
    @Autowired
    ClassLoaderRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }
}
