package com.anubhav.portfolio.repositories;

import com.anubhav.portfolio.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectsRepositories extends JpaRepository<Projects, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM projects WHERE is_deleted = ?1"
    )
    List<Projects> findAllByActiveIs(boolean isDeleted);
}
