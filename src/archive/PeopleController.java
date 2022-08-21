package main;

import main.model.People;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {


    @GetMapping("/people")
    public List<People> ListPeople() {
//        Iterable<Task_1> taskIterable = taskRepository.findAll();
//
//        ArrayList<Task_1> tasks = new ArrayList<>();
//        for (Task_1 task : taskIterable) {
//            tasks.add(task);
//        }
//        return tasks;
        return null;
    }

    @PostMapping("/people")
    public int addPeople(People people) {
//        if (taskRepository.count() == 0) {
//            task.setId(1);
//        }
//        Task_1 newTask = taskRepository.save(putDeadline(task));
//
//        return newTask.getId();
        return 0;
    }

    @GetMapping("/people/{id}")
    public ResponseEntity<?> getPeople(/*@PathVariable */int id) {
//        Optional<Task_1> optionalTask = taskRepository.findById(id);
//        if (!optionalTask.isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        return new ResponseEntity<>(optionalTask.get(), HttpStatus.OK);
        return null;
    }

    @DeleteMapping("/people/{id}")
    public ResponseEntity<?> dellPeople(/*@PathVariable */int id) {
//        Optional<Task_1> optionalTask = taskRepository.findById(id);
//        if (!optionalTask.isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        taskRepository.deleteById(id);
//        return new ResponseEntity<>(taskRepository.count(), HttpStatus.OK);
        return null;
    }

    @PutMapping("/people/{id}")
    public ResponseEntity<?> putPeopleId(People newPeople, /*@PathVariable */int id) {
//        Optional<Task_1> optionalTask = taskRepository.findById(id);
//        if (!optionalTask.isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//        Task_1 modifiedTask = putDeadline(newTask);
//        taskRepository.save(modifiedTask);
//        return new ResponseEntity<>(modifiedTask, HttpStatus.OK);
        return null;
    }

    @DeleteMapping("/people")
    public ResponseEntity dellAllPeople() {
//        if (taskRepository.count() == 0) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The list is already empty.");
//        }
//        taskRepository.deleteAll();
//        return new ResponseEntity<>(null, HttpStatus.OK);
        return null;
    }
}
