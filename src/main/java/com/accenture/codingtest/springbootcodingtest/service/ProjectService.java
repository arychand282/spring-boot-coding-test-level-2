package com.accenture.codingtest.springbootcodingtest.service;

import com.accenture.codingtest.springbootcodingtest.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    Project save(Project project);

    List<Project> findAll();

    Optional<Project> findById(String id);

}
