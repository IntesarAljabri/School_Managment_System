package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Classroom;
import School_Managment_System.School_Managment_System.Model.Student;
import School_Managment_System.School_Managment_System.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value ="api/Classes")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping(value = "getAll")
    public List<Classroom> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping(value = "getById")
    public Classroom getClassById(Long id) {
        return classService.getClassroomtById(id);
    }

    @PostMapping(value = "add")
    public String Class(@RequestBody Classroom classes) {
        classService.addClass(classes);
        return "Class added";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateClass(@PathVariable Long id, @RequestBody Classroom classroom) {
        classroom.setId(id);
        Classroom updatedClass = classService.updateClass(classroom.getClass(id).get());

        if (updatedClass != null) {
            return ResponseEntity.ok(updatedClass);
        }

        return ResponseEntity.notFound().build();
    }
}




