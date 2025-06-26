package com.blakewashington.securedtasks.controller;

import com.blakewashington.securedtasks.entity.Task;
import com.blakewashington.securedtasks.repository.TaskRepository;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskRepository.findById(id)
                .map(newTask -> {
                    newTask.setTitle(task.getTitle());
                    newTask.setDescription(task.getDescription());
                    newTask.setPriority(task.getPriority());
                    newTask.setCompleted(task.isCompleted());
                    newTask.setCreatedAt(task.getCreatedAt());
                    return ResponseEntity.ok(taskRepository.save(newTask));
                })
                .orElse(ResponseEntity.notFound().build()).getBody();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        if (!taskRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        taskRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
