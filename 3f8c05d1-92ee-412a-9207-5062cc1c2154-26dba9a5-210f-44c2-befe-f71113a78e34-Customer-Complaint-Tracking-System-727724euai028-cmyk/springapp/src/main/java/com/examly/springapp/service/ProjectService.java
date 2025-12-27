package com.examly.springapp.service;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.Project;
import com.examly.springapp.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepo.findById(id);
    }

    public Project updateProject(Long id, Project projectDetails) {
        Project project = projectRepo.findById(id).orElseThrow();
        project.setProjectName(projectDetails.getProjectName());
        project.setDescription(projectDetails.getDescription());
        project.setStatus(projectDetails.getStatus());
        return projectRepo.save(project);
    }

    public List<Project> getProjectsByStatus(String status) {
        List<Project> projects = projectRepo.findByStatus(status);
        if (projects.isEmpty()) {
            throw new ResourceNotFoundException("No projects found with status: " + status);
        }
        return projects;
    }
}