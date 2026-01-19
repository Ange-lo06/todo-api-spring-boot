package com.example.todo.service;

import com.example.todo.entity.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public List<Task> listAll(){
        return repository.findAll();
    }

    public Task create(Task task){
        return repository.save(task);
    }

    public Task update(Long id, Task task){
        Task existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Task não encontrada"));

        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setCompleted(task.isCompleted());

        return repository.save(existing);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
