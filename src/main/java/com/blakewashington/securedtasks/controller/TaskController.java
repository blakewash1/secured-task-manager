package com.blakewashington.securedtasks.controller;

import com.blakewashington.securedtasks.entity.Task;
import com.blakewashington.securedtasks.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

//    @PutMapping("/{id}")
//    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
//        return taskRepository.findById(id)
//                .map(task -> {
//                    task.
//                })
//    }
}
