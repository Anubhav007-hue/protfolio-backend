package com.anubhav.portfolio.controller;


import com.anubhav.portfolio.services.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CommunicationController {

    @Autowired private CommunicationService communicationService;

    @GetMapping("/api/user-profile/{id}")
    private Map<String, String> getUserProfile(@PathVariable Long id) {
       return communicationService.getUserDetails(id);
    }

    @GetMapping("/api/user-projects")
    private List<Map<String, Object>> getUserProjects() {
        return communicationService.getProjectDetails();
    }

    @GetMapping("/api/user-experience")
    private List<Map<String, Object>> getUserExperience() {
        return communicationService.getUserExperience();
    }

    @GetMapping("/api/user-certificate")
    private List<Map<String, String>> getUserCertificates() {
        return communicationService.getCertificates();
    }
}
