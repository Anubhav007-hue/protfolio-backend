package com.anubhav.portfolio.repositories;

import com.anubhav.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM experience WHERE is_deleted = ?1"
    )
    List<Experience> findAllByActiveIs(boolean isDeleted);
}
