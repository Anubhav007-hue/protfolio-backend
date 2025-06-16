package com.anubhav.portfolio.dao;

import com.anubhav.portfolio.model.Certificate;
import com.anubhav.portfolio.repositories.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateDaoService {

    @Autowired private CertificateRepository certificateRepository;

     public List<Certificate> findAllCertificates(boolean isDeleted) {
        return certificateRepository.findAllBy(isDeleted);
     }
}
