package com.salesianos.dam.apirest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Equivalente a @Controller + @ResponseBody
@RequestMapping("task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository repository;

    @GetMapping("/")
    public List<Task> findAll(){
        return  repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Task> create(@RequestBody Task task) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body((repository.save(task)));
    }

   // @GetMapping(/{id})
   // public{
   //
   // }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> DELETE(@PathVariable("id") Long id) {
        repository.deleteById();
        return ResponseEntity.noContent().build();
    }
}
