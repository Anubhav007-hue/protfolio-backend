package com.anubhav.portfolio.services;


import com.anubhav.portfolio.dao.CertificateDaoService;
import com.anubhav.portfolio.dao.ExperienceDaoService;
import com.anubhav.portfolio.dao.ProjectsDaoService;
import com.anubhav.portfolio.dao.UserProfileDaoService;
import com.anubhav.portfolio.model.Certificate;
import com.anubhav.portfolio.model.Experience;
import com.anubhav.portfolio.model.Projects;
import com.anubhav.portfolio.model.UserProfile;
import com.anubhav.portfolio.util.UtilityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class CommunicationService {

    @Autowired
    private UserProfileDaoService userProfileDaoService;

    @Autowired
    private ProjectsDaoService projectsDaoService;

    @Autowired
    private ExperienceDaoService experienceDaoService;

    @Autowired private CertificateDaoService certificateDaoService;


    @Autowired
    private UtilityClass utilityClass;

    public Map<String, String> getUserDetails(Long id) {
        UserProfile userProfile = userProfileDaoService.findByIdAndActiveIs(id, true);
        if (userProfile == null) {
            throw new RuntimeException("User profile not found with id: " + id);
        }
       Map<String, String> userDetails = new java.util.HashMap<>();
       userDetails.put("name", userProfile.getName() != null ? userProfile.getName() : "");
       userDetails.put("title", userProfile.getTitle() != null ? userProfile.getTitle() : "");
       userDetails.put("tagline", userProfile.getTagline() != null ? userProfile.getTagline() : "");
       userDetails.put("bio", userProfile.getBio() != null ? userProfile.getBio() : "");
       userDetails.put("email", userProfile.getEmail() != null ? userProfile.getEmail() : "");
       userDetails.put("phone", userProfile.getPhone() != null ? userProfile.getPhone() : "");
       userDetails.put("website", userProfile.getWebsite() != null ? userProfile.getWebsite() : "");
       userDetails.put("designation", userProfile.getDesignation() != null ? userProfile.getDesignation() : "");
       userDetails.put("github", userProfile.getGithub() != null ? userProfile.getGithub() : "");
       userDetails.put("linkedin", userProfile.getLinkedin() != null ? userProfile.getLinkedin() : "");
       userDetails.put("twitter", userProfile.getTwitter() != null ? userProfile.getTwitter() : "");
       userDetails.put("instagram", userProfile.getInstagram() != null ? userProfile.getInstagram() : "");
       return userDetails;
    }

    public List<Map<String, Object>> getProjectDetails() {
        List<Projects> projectsList = projectsDaoService.findAllByActiveIs(false);
        if (projectsList == null) {
            throw new RuntimeException("No Active Projects Found");
        }
        return utilityClass.parseProjects(projectsList);
    }

    public List<Map<String, Object>> getUserExperience() {
        List<Experience> experiencesList = experienceDaoService.findAllByActiveIs(false);
        if (experiencesList == null) {
            throw new RuntimeException("No Active Experience Found");
        }
        return utilityClass.parseExperience(experiencesList);
    }

    public List<Map<String, String>> getCertificates() {
        List<Certificate> certificates = certificateDaoService.findAllCertificates(false);
        if (certificates == null || certificates.isEmpty()) {
            return Collections.emptyList();
        }
        return utilityClass.parseCertificates(certificates);
    }




}
