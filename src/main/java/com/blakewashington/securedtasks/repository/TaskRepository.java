package com.blakewashington.securedtasks.repository;

import com.blakewashington.securedtasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
