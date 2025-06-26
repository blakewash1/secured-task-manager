package com.blakewashington.securedtasks.dto;

import com.blakewashington.securedtasks.enums.Priority;

import java.time.LocalDateTime;

/*
    a DTO for sending task data without the full user data
 */
public class TaskDTO {
    private Long id;
    private String username;
    private String title;
    private String description;
    private Priority priority;
    private boolean completed;
    private LocalDateTime createdDate;

    public TaskDTO(Long id, String username, String title, String description, Priority priority,
                   boolean completed, LocalDateTime createdDate) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
        this.createdDate = createdDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
