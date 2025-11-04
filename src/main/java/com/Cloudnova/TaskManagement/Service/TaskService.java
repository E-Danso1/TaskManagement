package com.Cloudnova.TaskManagement.Service;

import com.Cloudnova.TaskManagement.Model.Task;
import com.Cloudnova.TaskManagement.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService{

    @Autowired
    private TaskRepository taskRepository;

    //Create a new Task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    //Get All task
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    //Get one task by ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Update an existing task
    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id).map(task ->{
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setStatus(updatedTask.getStatus());
            return taskRepository.save(task);
        }).orElse(null);
    }

    // Delete a task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
