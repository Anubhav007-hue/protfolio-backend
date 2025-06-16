package com.anubhav.portfolio.dao;


import com.anubhav.portfolio.model.Projects;
import com.anubhav.portfolio.repositories.ProjectsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsDaoService {

    @Autowired private ProjectsRepositories projectsRepositories;

    public List<Projects> findAllByActiveIs(boolean isDeleted) {
        return projectsRepositories.findAllByActiveIs(isDeleted);
    }
}
