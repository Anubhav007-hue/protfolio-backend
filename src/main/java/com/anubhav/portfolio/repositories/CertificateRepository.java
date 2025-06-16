package com.anubhav.portfolio.repositories;

import com.anubhav.portfolio.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM certificate WHERE is_deleted = ?1"
    )
    List<Certificate> findAllBy(boolean isDeleted);
}
