package School_Managment_System.School_Managment_System.Controller;

import School_Managment_System.School_Managment_System.Model.Teacher;
import School_Managment_System.School_Managment_System.Request.TeacherRequest;
import School_Managment_System.School_Managment_System.Responce.TeacherResponse;
import School_Managment_System.School_Managment_System.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    //Get all Teacher
    @GetMapping(value = "getAll")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeachers();
    }

    //Get by id
    @GetMapping(value = "getById")
    public Teacher getTeacherById(@RequestParam Long id) {
        return teacherService.getTeacherById(id);
    }


    //Add new teacher
   @PostMapping("/addTeacher")
  public TeacherResponse addTeacher(@RequestBody TeacherRequest teacherRequest) {
    Teacher savedTeacher = teacherService.addTeacher(teacherRequest.convertToTeacher());

    TeacherResponse response = new TeacherResponse(
            savedTeacher.getId(),
            savedTeacher.getName(),
            savedTeacher.getPhone(),
            savedTeacher.getSpecialization(),
            savedTeacher.getAge()
    );

    return response;
}

  //delete teacher by id
    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return teacherService.deleteTeacher(id);
    }


   //Update teacher information
    @PutMapping("{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher updateData){
        Teacher teachers = teacherService.updateTeacher(id , updateData);
        if (teachers != null) {
            return ResponseEntity.ok(teachers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


