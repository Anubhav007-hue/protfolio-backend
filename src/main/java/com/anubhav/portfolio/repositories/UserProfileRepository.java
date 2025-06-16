package com.anubhav.portfolio.repositories;

import com.anubhav.portfolio.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM user_profile WHERE id = ?1 AND is_active = ?2"
    )
    UserProfile findByIdAndActiveIs(Long id, boolean active);
}
