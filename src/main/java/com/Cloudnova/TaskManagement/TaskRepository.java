package com.Cloudnova.TaskManagement;

import com.Cloudnova.TaskManagement.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
