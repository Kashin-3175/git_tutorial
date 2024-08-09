package com.example.todo.service.task;

import com.example.todo.repository.task.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;
    public List<TaskEntity> find() {
        return taskRepository.select();
    }



    public Optional<TaskEntity> findById(long taskId) {
        return taskRepository.selectId(taskId);
    }


    public void create(TaskEntity newEntity) {
        taskRepository.insert(newEntity);
    }
}
