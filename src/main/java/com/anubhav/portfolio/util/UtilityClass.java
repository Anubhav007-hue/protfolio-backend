package com.anubhav.portfolio.util;

import com.anubhav.portfolio.model.Certificate;
import com.anubhav.portfolio.model.Experience;
import com.anubhav.portfolio.model.Projects;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class UtilityClass {

    public List<Map<String, Object>> parseProjects(List<Projects> projectList) { // Changed return type to Object for skills list
        return projectList.stream()
                .map(project -> {
                    // Get the comma-separated skills string
                    String skillsString = project.getSkills();

                    // Split the string by comma, trim whitespace from each skill, and collect into a List
                    List<String> skillsList = (skillsString != null && !skillsString.trim().isEmpty()) ?
                            Arrays.stream(skillsString.split(","))
                                    .map(String::trim)
                                    .collect(Collectors.toList()) :
                            List.of(); // Return an empty list if skillsString is null or empty

                    return Map.of(
                            "title", project.getTitle(),
                            "description", project.getDescription(),
                            "skills", skillsList ,
                            "link",project.getLink(),
                            "imageUrl",project.getImageUrl()// Now 'skills' is a List<String>
                    );
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> parseExperience(List<Experience> experienceList) { // Changed return type to Object for skills list
        return experienceList.stream()
                .map(exp -> {
                    // Get the comma-separated skills string
                    String skillsString = exp.getSkills();

                    // Split the string by comma, trim whitespace from each skill, and collect into a List
                    List<String> skillsList = (skillsString != null && !skillsString.trim().isEmpty()) ?
                            Arrays.stream(skillsString.split(","))
                                    .map(String::trim)
                                    .collect(Collectors.toList()) :
                            List.of(); // Return an empty list if skillsString is null or empty

                  return Map.of(
                          "position", String.valueOf(exp.getPosition()),
                          "company", String.valueOf(exp.getCompany()),
                          "startDate", exp.getStartDate() != null ? exp.getStartDate().getMonth().toString() + " " + exp.getStartDate().getYear() : "",
                          "endDate", exp.getEndDate() == null ? "PRESENT" : exp.getEndDate().getMonth().toString() + " " + exp.getEndDate().getYear(),
                          "description", String.valueOf(exp.getDescription()),
                          "skills", skillsList
                  );
                })
                .collect(Collectors.toList());
    }


    public List<Map<String, String>> parseCertificates(List<Certificate> certificates) {
        return certificates.stream()
                .map(cert -> {
                    return Map.of(
                            "name", cert.getName(),
                            "link", cert.getLink(),
                            "imageUrl", cert.getImageUrl()
                    );
                })
                .collect(Collectors.toList());
    }
}
