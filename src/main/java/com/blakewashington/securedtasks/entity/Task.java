package com.blakewashington.securedtasks.entity;

import com.blakewashington.securedtasks.enums.Priority;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;

    private boolean completed;

    private LocalDateTime createdAt;


}
