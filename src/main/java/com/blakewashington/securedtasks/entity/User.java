package com.blakewashington.securedtasks.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String password;

    private boolean enabled;

    private String firstName;

    private String lastName;

    @OneToOne
    @JoinColumn(name = "role", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;
}
