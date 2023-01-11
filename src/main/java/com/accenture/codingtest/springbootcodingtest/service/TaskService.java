package com.accenture.codingtest.springbootcodingtest.service;

import com.accenture.codingtest.springbootcodingtest.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task save(Task task);

    Optional<Task> findById(String id);

    List<Task> findAll();

    List<Task> findByProjectId(String projectId);

    List<Task> findByUserId(String userId);

    Task update(Task task, String id);

}
