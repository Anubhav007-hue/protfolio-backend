package com.anubhav.portfolio.dao;


import com.anubhav.portfolio.model.Experience;
import com.anubhav.portfolio.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceDaoService {

    @Autowired private ExperienceRepository experienceRepository;

    public List<Experience> findAllByActiveIs(boolean isDeleted) {
        return experienceRepository.findAllByActiveIs(isDeleted);
    }
}
