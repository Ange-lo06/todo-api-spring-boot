package com.example.todo.controller;

import com.example.todo.entity.Task;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service){
        this.service = service;
    }

    //read
    @GetMapping
    public List<Task> list(){
        return service.listAll();
    }

    //create
    @PostMapping
    public Task create(@RequestBody Task task){
        return service.create(task);
    }

    //update
    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task){
        return service.update(id, task);
    }

    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
