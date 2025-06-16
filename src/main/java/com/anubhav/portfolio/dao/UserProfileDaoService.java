package com.anubhav.portfolio.dao;


import com.anubhav.portfolio.model.UserProfile;
import com.anubhav.portfolio.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileDaoService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    // This method should interact with the database to fetch user profile details.
        public UserProfile findByIdAndActiveIs(Long id, boolean active) {
        return userProfileRepository.findByIdAndActiveIs(id,active);
    }
}
