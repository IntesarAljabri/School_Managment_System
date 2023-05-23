package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Service.ClassService;
import School_Managment_System.School_Managment_System.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping(value = "getAll")
    public List<Class> getAllClasses() {
        return classService.getAllClass();
    }

    @GetMapping(value = "getById")
    public Optional<Class> getClassById(@RequestParam Long id) {

        return ClassService.getClassById(id);
    }

    @PostMapping(value = "add")
    public String Class(@RequestBody Class class) {
        ClassService.addClass( class);
        return "Class added";
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
//    @Autowired
//    ClassService classService;
//
//    @GetMapping
//    public List<Class> getAllClasses() {
//        return classService.getAllClasses();
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Class> findById(@PathVariable Long id) {
//        Optional<Class> classOptional = classService.getClassById(id);
//        if (classOptional.isPresent()) {
//            return ResponseEntity.ok(classOptional.get());
//        }
//        return ResponseEntity.notFound().build();
//    }
//   @PostMapping
//    public ResponseEntity<Class> createClass(@RequestBody Class newClass) {
//
//        Class createdClass = classService.createClass(newClass);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdClass);
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<Class> updateClass(@PathVariable Long id, @RequestBody Class updatedClass) throws NoSuchFieldException {
//        Optional<Class> existingClass = classService.getClassById(id);
//        if (existingClass.isPresent()) {
//            updatedClass.getField(String.valueOf(id));
//            Class updated = classService.updateClass(updatedClass);
//            return ResponseEntity.ok(updated);
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
//        classService.deleteClass(id);
//        return ResponseEntity.noContent().build();
//    }




